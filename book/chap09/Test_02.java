package chap09;

import java.util.*;

// 다익스트라 우선순위큐
class Node2 implements Comparable<Node2> {

	private int index;
	private int distance;

	public Node2(int index, int distance) {
		this.index = index;
		this.distance = distance;
	}

	public int getIndex() {
		return this.index;
	}

	public int getDistance() {
		return this.distance;
	}

	@Override
	// 거리가 짧은 것이 높은 우선순위
	public int compareTo(Node2 other) {
		if (this.distance < other.distance) {
			return -1;
		}
		return 1;
	}

}

public class Test_02 {

	public static final int INF = (int) 1e9; // 무한
	// n 노드 개수, m 간선 개수, start 시작 노드 번호
	public static int n, m, start;
	// 연결 노드 정보 배열
	public static ArrayList<ArrayList<Node2>> graph = new ArrayList<ArrayList<Node2>>();
	// 최단 거리 테이블
	public static int[] d = new int[100001];

	public static void dijkstra(int start) {
		PriorityQueue<Node2> pq = new PriorityQueue<>();
		// 시작 노드 최단 경로 0, 큐 삽입
		pq.offer(new Node2(start, 0));
		d[start] = 0;
		while (!pq.isEmpty()) {

			// 최단 거리가 가장 짧은 노드 정보 꺼내기
			Node2 node = pq.poll();
			int dist = node.getDistance(); // 현재 노드까지의 거리
			int now = node.getIndex(); // 현재 노드

			// 현재 노드가 처리된적 있으면 무시
			if (d[now] < dist)
				continue;

			// 현재 노드와 연결된 다른 노드 확인
			for (int i = 0; i < graph.get(now).size(); i++) {
				// 현재 노드를 거쳐서 다른 노드로 이동하는 거리
				int cost = d[now] + graph.get(now).get(i).getDistance();
				// 더 짧은 경우 → 갱신
				if (cost < d[graph.get(now).get(i).getIndex()]) {
					d[graph.get(now).get(i).getIndex()] = cost;
					pq.offer(new Node2(graph.get(now).get(i).getIndex(), cost));
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();

		// 그래프 초기화
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Node2>());
		}

		// 모든 간선 정보를 입력받기
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			// 노드 a → 노드 b, 비용 c
			graph.get(a).add(new Node2(b, c));
		}

		// 최단 거리 테이블 초기화(무한)
		Arrays.fill(d, INF);

		dijkstra(start);

		for (int i = 1; i <= n; i++) {
			if (d[i] == INF) {
				System.out.println("INFINITY");
			} else {
				System.out.println(d[i]);
			}
		}
	}

}
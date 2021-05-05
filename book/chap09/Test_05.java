package chap09;

import java.util.*;

class Node3 implements Comparable<Node3> {

	private int index;
	private int distance;

	public Node3(int index, int distance) {
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
	public int compareTo(Node3 other) {
		if (this.distance < other.distance) {
			return -1;
		}
		return 1;
	}

}

public class Test_05 {

	public static final int INF = (int) 1e9;

	public static ArrayList<ArrayList<Node3>> graph = new ArrayList<ArrayList<Node3>>();

	public static int[] d = new int[30001];

	public static void dijkstra(int start) {
		PriorityQueue<Node3> pq = new PriorityQueue<>();
		// 시작 노드 최단 경로 0, 큐 삽입
		pq.offer(new Node3(start, 0));
		d[start] = 0;
		while (!pq.isEmpty()) {

			// 최단 거리가 가장 짧은 노드 정보 꺼내기
			Node3 node = pq.poll();
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
					pq.offer(new Node3(graph.get(now).get(i).getIndex(), cost));
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int start = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Node3>());
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			graph.get(a).add(new Node3(b, c));
		}

		Arrays.fill(d, INF);

		dijkstra(start);

		int cnt = 0;
		int max = 0;

		for (int i = 1; i <= n; i++) {
			if (i == start) {
				continue;
			}
			if (d[i] != INF) {
				cnt++;
				max = Math.max(max, d[i]);
			}
		}

		System.out.println(cnt + " " + max);

	}

}

/*
 * 
 * 7 10 2 1 2 1 2 3 3 2 4 2 2 5 6 5 3 2 5 2 6 5 6 11 6 5 11 7 4 3 7 6 5
 * 
 * 
 * 
 */
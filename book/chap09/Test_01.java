package chap09;

import java.util.*;

// 다익스트라
class Node {
	private int index;
	private int distance;

	public Node(int index, int distance) {
		this.index = index;
		this.distance = distance;
	}

	public int getIndex() {
		return this.index;
	}

	public int getDistance() {
		return this.distance;
	}
}

public class Test_01 {

	public static final int INF = (int) 1e9; // 무한
	// n 노드 개수, m 간선 개수, start 시작 노드 번호
	public static int n, m, start;
	// 연결 노드 정보 배열
	public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
	// 방문 체크 배열
	public static boolean[] visited = new boolean[100001];
	// 최단 거리 테이블
	public static int[] d = new int[100001];

	// 방문하지 않은 노드 중에서 최단 거리가 가장 짧은 노드 번호 반환
	public static int getSmallestNode() {
		int min_value = INF;
		int index = 0; // 가장 최단 거리가 짧은 노드(인덱스)
		for (int i = 1; i <= n; i++) {
			if (d[i] < min_value && !visited[i]) {
				min_value = d[i];
				index = i;
			}
		}
		return index;
	}

	public static void dijkstra(int start) {

		d[start] = 0; // 시작 노드 초기화
		visited[start] = true; // 방문처리

		for (int j = 0; j < graph.get(start).size(); j++) {
			// 시작 노드와 연결된 노드 갱신
			d[graph.get(start).get(j).getIndex()] = graph.get(start).get(j).getDistance();
		}
		// 시작 노드 제외 → (n-1)번 반복
		for (int i = 0; i < n - 1; i++) {
			// 최단 거리가 가장 짧은 노드 → 방문 처리
			int now = getSmallestNode();
			visited[now] = true;
			// 현재 노드와 연결된 다른 노드를 확인
			for (int j = 0; j < graph.get(now).size(); j++) {
				// 현재 노드를 거쳐서 다른 노드로 이동하는 거리
				int cost = d[now] + graph.get(now).get(j).getDistance();
				// 더 짧은 경우 → 갱신
				if (cost < d[graph.get(now).get(j).getIndex()]) {
					d[graph.get(now).get(j).getIndex()] = cost;
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
			graph.add(new ArrayList<Node>());
		}

		// 간선 정보 입력
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			// 노드 a → 노드 b, 비용 c
			graph.get(a).add(new Node(b, c));
		}

		// 최단 거리 테이블 초기화
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

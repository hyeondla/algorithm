package chap10;

import java.util.*;

//크루스칼

class Edge implements Comparable<Edge> {

	private int distance;
	private int nodeA;
	private int nodeB;

	public Edge(int distance, int nodeA, int nodeB) {
		this.distance = distance;
		this.nodeA = nodeA;
		this.nodeB = nodeB;
	}

	public int getDistance() {
		return this.distance;
	}

	public int getNodeA() {
		return this.nodeA;
	}

	public int getNodeB() {
		return this.nodeB;
	}

	// 거리가 짧은 것이 높은 우선순위
	@Override
	public int compareTo(Edge other) {
		if (this.distance < other.distance) {
			return -1;
		}
		return 1;
	}
}

public class Test_05 {

	public static int v, e;
	public static int[] parent = new int[100001];
	public static ArrayList<Edge> edges = new ArrayList<>();
	public static int result = 0;

	public static int findParent(int x) {
		if (x == parent[x])
			return x;
		return parent[x] = findParent(parent[x]);
	}

	public static void unionParent(int a, int b) {
		a = findParent(a);
		b = findParent(b);
		if (a < b)
			parent[b] = a;
		else
			parent[a] = b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		v = sc.nextInt();
		e = sc.nextInt();

		for (int i = 1; i <= v; i++) {
			parent[i] = i;
		}

		for (int i = 0; i < e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int cost = sc.nextInt();
			edges.add(new Edge(cost, a, b));
		}

		// 비용순 정렬
		Collections.sort(edges);

		// 간선 하나씩 확인
		for (int i = 0; i < edges.size(); i++) {
			int cost = edges.get(i).getDistance();
			int a = edges.get(i).getNodeA();
			int b = edges.get(i).getNodeB();
			// 사이클이 발생하지 않는 경우
			if (findParent(a) != findParent(b)) {
				unionParent(a, b); // union
				result += cost;
			}
		}

		System.out.println(result);
	}

}

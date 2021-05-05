package chap10;

import java.util.*;

//위상 정렬
public class Test_06 {

	// V 노드 개수, E 간선 개수
	public static int v, e;
	// 모든 노드에 대한 진입차수
	public static int[] indegree = new int[100001];
	// 각 노드에 연결된 간선 정보
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

	public static void topologySort() {

		ArrayList<Integer> result = new ArrayList<>(); // 큐에서 빠져나간 노드 번호 저장
		Queue<Integer> q = new LinkedList<>();

		// 진입차수가 0인 노드를 큐에 삽입
		for (int i = 1; i <= v; i++) {
			if (indegree[i] == 0) {
				q.offer(i);
			}
		}

		while (!q.isEmpty()) {
			int now = q.poll();
			result.add(now);
			for (int i = 0; i < graph.get(now).size(); i++) {
				// 해당 원소와 연결된 노드들의 진입차수 -1
				indegree[graph.get(now).get(i)]--;
				// 진입차수가 0이 되는 노드를 큐에 삽입
				if (indegree[graph.get(now).get(i)] == 0) {
					q.offer(graph.get(now).get(i));
				}
			}
		}

		// 위상 정렬 수행 결과
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		v = sc.nextInt();
		e = sc.nextInt();

		// 그래프 초기화
		for (int i = 0; i <= v; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b); // a → b 노드 연결
			indegree[b]++; // b 노드 진입 차수 +1
		}

		topologySort();

	}

}

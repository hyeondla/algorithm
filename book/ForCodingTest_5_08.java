import java.util.*;

public class ForCodingTest_5_08 {

	public static boolean[] visited = new boolean[9]; // 방문 정보 저장
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

	public static void dfs(int x) {

		visited[x] = true; // 방문 처리
		System.out.print(x + " ");

		for (int i = 0; i < graph.get(x).size(); i++) {
			int y = graph.get(x).get(i);
			if (visited[y] == false) {
				dfs(y);
			}
		}

	}

	public static void main(String[] args) {

		// 초기화
		for (int i = 0; i < 9; i++) {
			graph.add(new ArrayList<Integer>());
		}

		// ======= 노드 정보 =========
		graph.get(1).add(2);
		graph.get(1).add(3);
		graph.get(1).add(8);
		graph.get(2).add(1);
		graph.get(2).add(7);
		graph.get(3).add(1);
		graph.get(3).add(4);
		graph.get(3).add(5);
		graph.get(4).add(3);
		graph.get(4).add(5);
		graph.get(5).add(3);
		graph.get(5).add(4);
		graph.get(6).add(7);
		graph.get(7).add(2);
		graph.get(7).add(6);
		graph.get(7).add(8);
		graph.get(8).add(1);
		graph.get(8).add(7);
		// ===========================

		// 탐색 시작 노드
		dfs(1);

	}

}

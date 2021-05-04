import java.util.*;

class Node {

	private int index;
	private int distance;

	public Node(int index, int distance) {
		this.index = index;
		this.distance = distance;
	}

	public void show() {
		System.out.print("(" + this.index + "," + this.distance + ") ");
	}

}

public class ForCodingTest_5_07 {

	// 인접 리스트
	public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

	public static void main(String[] args) {

		// 그래프 초기화 => 행 크기만큼 반복
		for (int i = 0; i < 3; i++) {
			graph.add(new ArrayList<Node>());
		}

		// 각 노드에 연결된 노드 정보 저장 (노드, 거리)
		graph.get(0).add(new Node(1, 7));
		graph.get(0).add(new Node(2, 5));
		graph.get(1).add(new Node(0, 7));
		graph.get(2).add(new Node(0, 5));

		// 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("Node " + i + " : ");
			for (int j = 0; j < graph.get(i).size(); j++) {
				graph.get(i).get(j).show();
			}
			System.out.println();
		}
	}

}
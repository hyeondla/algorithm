package chap10;

import java.util.Scanner;

//서로소 집합 사이클
public class Test_04 {

	public static int[] parent = new int[100001]; // 부모 테이블

	// 속한 집합 찾기
	public static int findParent(int x) {
		// 루트 노드를 찾을 때까지 재귀 호출
		if (x == parent[x]) {
			return x;
		}
		return parent[x] = findParent(parent[x]);
	}

	// 집합 합치기
	public static void unionParent(int a, int b) {
		a = findParent(a);
		b = findParent(b);
		// 번호가 더 작은 원소가 부모 노드
		if (a < b) {
			parent[b] = a;
		} else {
			parent[a] = b;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int v = sc.nextInt();
		int e = sc.nextInt();

		// 부모 테이블 초기화
		for (int i = 1; i <= v; i++) {
			parent[i] = i;
		}

		boolean cycle = false; // 사이클 여부

		// union
		for (int i = 0; i < e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (findParent(a) == findParent(b)) {
				cycle = true;
				break;
			} else {
				unionParent(a, b);
			}
		}

		if (cycle) {
			System.out.println("사이클 발생");
		} else {
			System.out.println("사이클 발생하지 않음");
		}

	}

}

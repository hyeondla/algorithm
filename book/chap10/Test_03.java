package chap10;

import java.util.*;

// 서로소 집합
public class Test_03 {

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

		// union
		for (int i = 0; i < e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			unionParent(a, b);
		}

		System.out.println("각 원소가 속한 집합 : ");
		for (int i = 1; i <= v; i++) {
			System.out.print(findParent(i) + " ");
		}
		System.out.println();

		System.out.println("부모 테이블 : ");
		for (int i = 1; i <= v; i++) {
			System.out.print(parent[i] + " ");
		}
		System.out.println();
	}

}

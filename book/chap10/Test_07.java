package chap10;

import java.util.*;

public class Test_07 {

	public static int v, e;
	public static int[] parent = new int[100001];

	public static int findParent(int x) {
		if (x == parent[x]) {
			return x;
		}
		return parent[x] = findParent(parent[x]);
	}

	public static void unionParent(int a, int b) {
		a = findParent(a);
		b = findParent(b);

		if (a < b) {
			parent[b] = a;
		} else {
			parent[a] = b;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		v = sc.nextInt();
		e = sc.nextInt();

		for (int i = 0; i <= v; i++) {
			parent[i] = i;
		}

		for (int i = 0; i < e; i++) {
			int op = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (op == 0) { // 팀 합치기
				unionParent(a, b);
			} else if (op == 1) { // 확인
				if (findParent(a) == findParent(b)) { // 같은 팀
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}

		}
	}

}

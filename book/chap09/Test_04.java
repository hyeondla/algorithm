package chap09;

import java.util.*;

public class Test_04 {

	public static final int INF = (int) 1e9;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] com = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(com[i], INF);
			com[i][i] = 0;
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			com[a][b] = 1;
			com[b][a] = 1;
		}

		int x = sc.nextInt();
		int k = sc.nextInt();

//		showTable(com, n);
//		System.out.println("------------");

		for (int c = 1; c <= n; c++) {
			for (int a = 1; a <= n; a++) {
				for (int b = 1; b <= n; b++) {
					com[a][b] = Math.min(com[a][b], com[a][c] + com[c][b]);
				}
			}
//			showTable(com, n);
//			System.out.println("-------------");
		}

		int result = com[1][k] + com[k][x];

		if (result < INF) {
			System.out.println(result);
		} else {
			System.out.println(-1);
		}

	}

	public static void showTable(int[][] arr, int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (arr[i][j] == INF) {
					System.out.print(" ∞ ");
				} else {
					System.out.printf("%2d ", arr[i][j]);
				}
			}
			System.out.println();
		}
	}

}

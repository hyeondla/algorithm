package chap09;

import java.util.*;

// 플로이드 위셜
public class Test_03 {

	public static final int INF = (int) 1e9;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		// 최단 거리 테이블 초기화
		int[][] d = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(d[i], INF);
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					d[i][j] = 0;
				}
			}
		}

		// 간선 정보 입력
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			d[a][b] = c;
		}

		for (int k = 1; k <= n; k++) {
			for (int a = 1; a <= n; a++) {
				for (int b = 1; b <= n; b++) {
					d[a][b] = Math.min(d[a][b], d[a][k] + d[k][b]);
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (d[i][j] == INF) {
					System.out.println("INFINITY");
				} else {
					System.out.print(d[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}

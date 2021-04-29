import java.util.*;

public class ForCodingTest_4_04 {

	public static int d;

	public static void turn() {
		d--;
		if (d == -1) {
			d = 3;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int x = sc.nextInt();
		int y = sc.nextInt();
		d = sc.nextInt();

		int[][] visit = new int[n][m];
		visit[x][y] = 1; // 방문

		int[][] map = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		int[] move_x = { -1, 0, 1, 0 };
		int[] move_y = { 0, 1, 0, -1 };
		int xx, yy;

		int cnt = 1, turn_time = 0;
		while (true) {

			turn();

			xx = x + move_x[d];
			yy = y + move_y[d];

			if (visit[xx][yy] == 0 && map[xx][yy] == 0) {
				visit[xx][yy] = 1;
				x = xx;
				y = yy;
				cnt++;
				turn_time = 0;
				continue;
			} else {
				turn_time++;
			}

			if (turn_time == 4) {
				xx = x - move_x[d];
				yy = y - move_y[d];

				if (map[xx][yy] == 0) {
					x = xx;
					y = yy;
				} else {
					break;
				}
				turn_time = 0;
			}

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("%d ", visit[i][j]);
			}
			System.out.println();
		}

		System.out.println(cnt);
	}

}

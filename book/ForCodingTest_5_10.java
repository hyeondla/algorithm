import java.util.*;

public class ForCodingTest_5_10 {

	public static int n, m;
	public static int[][] ice = new int[1000][1000];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				ice[i][j] = str.charAt(j) - '0';
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (ice[i][j] == 0) {
					freeze(i, j);
					count++;
				}

			}
		}

		System.out.println(count);

	}

	public static void freeze(int x, int y) {

		if (x < 0 || x >= n || y < 0 || y >= m) {
			return;
		}

		if (ice[x][y] == 0) {

			ice[x][y] = 1;

			freeze(x - 1, y);
			freeze(x, y - 1);
			freeze(x, y + 1);
			freeze(x + 1, y);

		}

	}

}

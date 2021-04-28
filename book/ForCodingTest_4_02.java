import java.util.*;

public class ForCodingTest_4_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;

		for (int h = 0; h <= n; h++) {
			for (int m = 0; m < 60; m++) {
				for (int s = 0; s < 60; s++) {
					if (s % 10 == 3 || m % 10 == 3 || h % 10 == 3) {
						cnt++;
					} else if (s / 10 == 3 || m / 10 == 3) {
						cnt++;
					}
				}
			}
		}

		System.out.println(cnt);

	}

}

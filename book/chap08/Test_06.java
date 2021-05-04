import java.util.*;

public class ForCodingTest_8_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] k = new int[n];
		for (int i = 0; i < n; i++) {
			k[i] = sc.nextInt();
		}

		int[] dp = new int[100];

		dp[0] = k[0];
		dp[1] = Math.max(dp[0], k[1]);

		for (int i = 2; i < n; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + k[i]);
		}

		System.out.println(dp[n - 1]);

	}

}

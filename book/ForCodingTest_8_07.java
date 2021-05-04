import java.util.*;

public class ForCodingTest_8_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] dp = new int[1001];
		dp[1] = 1;
		dp[2] = 3;
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] * 2;
		}

		System.out.println(dp[n] % 796796);
	}

}

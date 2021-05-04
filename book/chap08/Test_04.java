
public class ForCodingTest_8_04 {

	public static void main(String[] args) {
		// 보텀업 방식
		long[] dp = new long[100];
		dp[1] = 1;
		dp[2] = 1;
		for (int i = 3; i <= 90; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		System.out.println(dp[90]);
	}

}

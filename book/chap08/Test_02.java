
public class ForCodingTest_8_02 {

	public static long[] dp = new long[100];

	// 탑다운(메모이제이션) 방식
	public static long Fibo(int x) {
		if (x == 1 || x == 2) {
			return 1;
		}

		if (dp[x] != 0) {
			return dp[x];
		} else {
			dp[x] = Fibo(x - 1) + Fibo(x - 2);
			return dp[x];
		}

	}

	public static void main(String[] args) {

		System.out.println(Fibo(90));

	}

}

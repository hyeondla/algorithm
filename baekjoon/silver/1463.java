import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] dp = new int[1000001];
		dp[1] = 0;
		for(int i=2; i<=n; i++) {
			// 셋 중 가장 작은 값 저장
			dp[i] = dp[i-1] + 1; // -1
			if(i % 2 == 0) { // ÷2
				dp[i] = dp[i] > dp[i/2]+1 ? dp[i/2]+1 : dp[i];
			}
			if(i % 3 == 0) { // ÷3
				dp[i] = dp[i] > dp[i/3]+1 ? dp[i/3]+1 : dp[i];
			}
		}
		
		System.out.println(dp[n]);
		
		sc.close();
	}
}

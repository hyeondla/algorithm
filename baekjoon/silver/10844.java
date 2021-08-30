import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static final int MOD = 1000000000;
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); // 길이
		int[][] dp = new int[n+1][10]; // 행 -> 길이 , 열 -> 각 자리수(0~9)로 끝나는 수의 개수
		for(int i=1; i<10; i++) { // 길이 1 => 1 ~ 9
			dp[1][i] = 1;
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<10; j++) {
				if(j == 0) { // 01
					dp[i][j] = dp[i-1][j+1] % MOD;
				} else if(j == 9) { // 98
					dp[i][j] = dp[i-1][j-1] % MOD;
				} else { // 10 11 21 23 32 34 43 45 54 56 65 67 76 78 87 89
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % MOD; 
				}
			}
		}
		
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum = (sum + dp[n][i]) % MOD;
		}
		System.out.println(sum);
		
	}
}

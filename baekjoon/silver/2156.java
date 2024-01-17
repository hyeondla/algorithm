import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); // 포도주 잔의 갯수
		int[] wine = new int[n+1];
		for(int i=1; i<=n; i++) {
			wine[i] = Integer.parseInt(bf.readLine()); // 포도주 양
		}
		int[] dp = new int[n+1];
		dp[1] = wine[1];
		if(n == 1) {
      System.out.println(dp[1]); 
      return;
    }
		dp[2] = wine[1] + wine[2];
		for(int i=3; i<=n; i++) {
			dp[i] = Math.max(wine[i-1] + dp[i-3], dp[i-2]) + wine[i];
			// 안마시는 경우 추가 예) 100 100 1
			dp[i] = Math.max(dp[i], dp[i-1]);
		}
		System.out.println(dp[n]);
	}
}

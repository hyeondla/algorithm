import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); // 삼각형 크기
		int[][] arr = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j=1; j<=i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int[][] dp = new int[n+1][n+1];
		dp[1][1] = arr[1][1];
		int max = arr[1][1];
		for(int i=2; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];
				if(i == n) {
					max = max >= dp[i][j] ? max : dp[i][j];
				}
			}
		}
		System.out.println(max);
	}
}

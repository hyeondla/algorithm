import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); // 집의 수
		int[][] house = new int[n][3]; // 페인트 비용
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			house[i][0] = Integer.parseInt(st.nextToken()); // 빨강
			house[i][1] = Integer.parseInt(st.nextToken()); // 초록
			house[i][2] = Integer.parseInt(st.nextToken()); // 파랑
		}
		bf.close();
		
		int[][] dp = new int[n][3];
		dp[0][0] = house[0][0]; dp[0][1] = house[0][1]; dp[0][2] = house[0][2];
		for(int i=1; i<n; i++) {
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + house[i][0];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + house[i][1];
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + house[i][2];
		}
		
		System.out.println(Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
	}
}

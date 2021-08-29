import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] arr = new int[n], dp = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] = arr[0];
		int answer = dp[0];
		for(int i=1; i<n; i++) {
			dp[i] = Math.max(arr[i], dp[i-1] + arr[i]);
			answer = (answer > dp[i]) ? answer : dp[i];
		}
		System.out.println(answer);
		bf.close();
	}
}

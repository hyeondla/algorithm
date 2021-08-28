import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] arr = new int[n+1], dp = new int[n+1];
		for(int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int answer = 0;
		for(int i=1; i<=n; i++) {
			int max = 0;
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j]) {
					max = Math.max(max, dp[j]);
				}
			}
			dp[i] = max + 1;
			answer = Math.max(answer, dp[i]);
		}
		System.out.println(answer);
		bf.close();
	}
}

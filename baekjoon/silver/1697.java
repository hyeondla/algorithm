import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static final int INF = (int) 1e9;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken()); // 시작 위치
		int k = Integer.parseInt(st.nextToken()); // 목표 위치
		bf.close();
		int[] dp = new int[100001];
		Arrays.fill(dp, INF); // 무한의 값으로 초기화
		dp[n] = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(n); // 큐에 시작 위치 추가

		while(!q.isEmpty()) {
			int x = q.poll();
			int[] nx = {x-1, x+1, x*2}; // 위치 이동
			for(int i=0; i<3; i++) {
				if(nx[i] >= 0 && nx[i] <= 100000 && dp[nx[i]] == INF) {
					dp[nx[i]] = Math.min(dp[nx[i]], dp[x]+1); // 기존 값과 새로운 값 중 최소값 저장
					q.add(nx[i]); // 큐에 추가
				}
			}
			if(dp[k] != INF) break; // 목표 도착
		}
		System.out.println(dp[k]);
		
	}
}

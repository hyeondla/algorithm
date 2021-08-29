import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] p = new int[n];
		for(int i=0; i<n; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(p); 
//		System.out.println(Arrays.toString(p));
		int sum = 0, answer = 0;
		for(int i=0; i<n; i++) {
			sum = sum + p[i];
			answer += sum;
		}
		System.out.println(answer);
		
		bf.close();
	}
}

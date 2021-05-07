package chap11;
import java.util.*;

public class Test_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] ball = new int[11];
		
		for(int i=0; i<n; i++) {
			int w = sc.nextInt();
			ball[w]++;
		}
		
		int sum=0;
		for(int i=1; i<=m; i++) {
			sum += ball[i] * (n-ball[i]);
			n -= ball[i];
		}
		
		System.out.println(sum);
	}

}

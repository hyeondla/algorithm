import java.util.*;

public class ForCodingTest_6_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=0; i<k; i++) {
			if(a[i] < b[n-1-i]) {
				int tmp = a[i];
				a[i] = b[n-1-i];
				b[n-1-i] = tmp;
			} else {
				break;
			}
		}
		
		long sum = 0;
		for(int i=0; i<n; i++) {
			sum += a[i];
		}
		
		System.out.println(sum);
	}

}

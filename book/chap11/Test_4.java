package chap11;
import java.util.*;
public class Test_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum = 1;
		
		for(int i=0; i<n; i++) {
			
			if(sum < arr[i]) {
				break;
			}
			
			sum += arr[i];
		}
		
		System.out.println(sum);
		
	}

}

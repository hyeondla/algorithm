import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int index = n;
		int k = sc.nextInt();
		
		int[] coin = new int[n];
		while(index-->0) {
			coin[index] = sc.nextInt();
		}
		
		int count = 0;
		for(int i=0; i<n; i++) {
			
			count += k / coin[i];
			k = k % coin[i];
			
			if(k == 0) break;
			
		}
		System.out.println(count);
		
		sc.close();
	}
}

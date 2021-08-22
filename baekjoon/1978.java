import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			if(num == 1) continue;
			if(num == 2 || num == 3) {
				count++; continue;
			}
			for(int j=2; j<=num/2; j++) {
				if(num % j == 0) {
					break;
				}
				if(j == num/2) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}
}

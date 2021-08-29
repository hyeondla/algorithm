import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 1 ~ 1000
		
		int count = 0;
		// 1 ~ 99
		if(n/100 == 0) {
			count = n;
		} else {
			count = 99;
		}
		// 100 ~ 999
		for(int i=100; i<=n; i++) {
			if(i%1000/100 - i%100/10 == i%100/10 - i%10) {
				count++;
			}
		}
		
		if(n == 1000) {
			count --;
		}
    
		System.out.println(count);
		
	}
}

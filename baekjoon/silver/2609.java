import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int maxNum = Math.max(num1, num2);
		
		int answer = 0;
		for(int i=1; i<=maxNum; i++) {
			if(num1%i == 0 && num2%i == 0) {
				answer = i;
			}
		}
		System.out.println(answer);
		System.out.println(num1 * num2 / answer);
		
		sc.close();
	}
}

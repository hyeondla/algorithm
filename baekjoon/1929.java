import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		// 에라토스테네스의 체 => 소수 대량 판별 방법
		// 특정한 숫자의 제곱근까지만 약수 여부 검증
		boolean[] check = new boolean[n+1];
		check[1] = true;
		for(int i=2; i<=n; i++) { 
			// 배수에 해당하는 수 제외 (자기자신 X)
			int j = i * 2; 
			for( ; j<=n; j+=i) {
				check[j] = true; // 소수가 아닌 수 -> true
			}
		}
		
		for(int i=m; i<=n; i++) {
			if(!check[i]) System.out.println(i);
		}
		
		sc.close();
	}
}

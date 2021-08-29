import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stair = new int[301];
		for(int i=1; i<=n; i++) {
			stair[i] = sc.nextInt();
		}
		
		int[] sum = new int[301];
		sum[1] = stair[1]; sum[2] = stair[1] + stair[2];
		for(int i=3; i<=n; i++) {
			sum[i] = stair[i] + Math.max(sum[i-3] + stair[i-1], sum[i-2]);
		}
		System.out.println(sum[n]);
		
		sc.close();
		
	}
}

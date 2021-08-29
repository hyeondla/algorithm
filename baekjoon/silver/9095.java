import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] d = new int[11];
		d[1] = 1; d[2] = 2; d[3] = 4;
		for(int i=4; i<11; i++) {
			d[i] = d[i-3] + d[i-2] + d[i-1];
		}
		
		while(t --> 0) {
			int n = sc.nextInt();
			System.out.println(d[n]);
		}
		sc.close();
	}
}

import java.util.*;

public class ForCodingTest_7_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] parts = new int[1000001];
		for (int i = 0; i < n; i++) {
			int index = sc.nextInt();
			parts[index]++;
		}

		int m = sc.nextInt();
		int[] req = new int[m];
		for (int i = 0; i < m; i++) {
			req[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			if (parts[req[i]] > 0) {
				System.out.print("yes ");
			} else {
				System.out.print("no ");
			}
		}

	}

}

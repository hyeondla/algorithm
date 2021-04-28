import java.util.*;

public class BookForCodingTest_3_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr = new int[n][m];
		int[] min = new int[n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr[i]);
			min[i] = arr[i][0];
		}

		Arrays.sort(min);
		System.out.println(min[n - 1]);

	}

}

import java.util.*;

public class ForCodingTest_3_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int max1 = arr[n - 1];
		int max2 = arr[n - 2];

		int count = m / (k + 1);

		int sum = (m - count) * max1 + count * max2;
		System.out.println(sum);

	}

}

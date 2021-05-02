import java.util.*;

public class ForCodingTest_7_05 {

	public static int Find(int[] arr, int target, int start, int end) {
		if (start > end)
			return -1;

		int mid = (start + end) / 2;
		if (arr[mid] == target) {
			return mid;
		} else if (arr[mid] > target) {
			return Find(arr, target, start, mid - 1);
		} else {
			return Find(arr, target, mid + 1, end);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] parts = new int[n];
		for (int i = 0; i < n; i++) {
			parts[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] req = new int[m];
		for (int i = 0; i < m; i++) {
			req[i] = sc.nextInt();
		}

		Arrays.sort(parts);

		for (int i = 0; i < m; i++) {
			int result = Find(parts, req[i], 0, n - 1);
			if (result == -1) {
				System.out.print("no ");
			} else {
				System.out.print("yes ");
			}
		}

	}

}

import java.util.*;

public class ForCodingTest_7_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] tteok = new int[n];
		for (int i = 0; i < n; i++) {
			tteok[i] = sc.nextInt();
		}

		// 높이 0 ~ 10억
		int start = 0;
		int end = (int) 1e9;
		int h = 0;

		while (start <= end) {
			long total = 0;

			int mid = (start + end) / 2;
			for (int i = 0; i < n; i++) {
				// 잘린 떡 길이
				if (tteok[i] > mid) {
					total += tteok[i] - mid;
				}
			}

			if (total < m) { // 떡 부족 -> 더 많이 자르기 (왼쪽 탐색)
				end = mid - 1;
			} else { // 떡 충분 -> 덜 자르기 (오른쪽 탐색)
				h = mid; // 높이 저장
				start = mid + 1;
			}
		}

		System.out.println(h);

	}

}

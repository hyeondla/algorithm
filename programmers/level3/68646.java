// 풍선 터트리기
class Solution {

	public int solution(int[] a) {

		if (a.length == 1 || a.length == 2) {
			return a.length;
		}

		int answer = 2;

		int[] left = new int[a.length];
		int[] right = new int[a.length];

		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			left[i] = min;
			if (min > a[i]) {
				min = a[i];
			}
		}

		min = a[a.length - 1];
		for (int i = a.length - 1; i > 0; i--) {
			right[i] = min;
			if (min > a[i]) {
				min = a[i];
			}
		}

		for (int i = 1; i < a.length - 1; i++) {

			if (a[i] < left[i] || a[i] < right[i]) {
				answer++;
			}

		}

		return answer;

	}
}
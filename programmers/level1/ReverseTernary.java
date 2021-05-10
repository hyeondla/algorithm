// 3진법 뒤집기
class Solution {
	public int solution(int n) {
		int answer = 0;
		int[] arr = new int[20];
		int len = 0;

		for (int i = 1;; i++) {
			arr[i] = n % 3;
			n /= 3;
			if (n == 0) {
				len = i;
				break;
			}
		}

		for (int i = 1; i <= len; i++) {
			answer += arr[i] * Math.pow(3, len - i);
			System.out.println(answer);
		}

		return answer;
	}
}
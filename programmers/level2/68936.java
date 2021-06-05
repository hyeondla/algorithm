// 쿼드압축 후 개수 세기
class Solution {

	public static int[] count = new int[2];

	public static void quad(int[][] arr, int x, int y, int end) {
		int first = arr[x][y];
		boolean check = false;
		if (end == 1) {
			count[arr[x][y]]++;
			return;
		}
		loop: for (int i = x; i < x + end; i++) {
			for (int j = y; j < y + end; j++) {
				if (arr[i][j] == first) {
					// 첫번째 값과 일치
					if (i == x + end - 1 && j == y + end - 1) { // 마지막까지 모두 일치
						check = true;
						count[first]++;
					}
				} else {
					check = false;
					break loop; // 불일치
				}
			}
		}
		if (check == false) {
			end /= 2;
			quad(arr, x, y, end);
			quad(arr, x, y + end, end);
			quad(arr, x + end, y, end);
			quad(arr, x + end, y + end, end);
		}
	}

	public int[] solution(int[][] arr) {
		quad(arr, 0, 0, arr.length);
		int[] answer = { count[0], count[1] };
		return answer;
	}
}
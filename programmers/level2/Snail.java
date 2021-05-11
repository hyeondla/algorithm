// 삼각 달팽이
class Solution {
	public int[] solution(int n) {
		int max = n * (n + 1) / 2;
		int[] answer = new int[max];
		int[][] arr = new int[n][n];
		int x = 0, y = 0;
		int turn = 0;
		int len = n, count = n;

		for (int i = 1; i <= max; i++) {
			arr[x][y] = i;
			len--;
			if (len == 0) {
				turn++;
				len = --count;
			}

			if (turn % 3 == 0) { // 아래
				x++;
			} else if (turn % 3 == 1) { // 오른쪽
				y++;
			} else if (turn % 3 == 2) { // 대각선
				x--;
				y--;
			}
		}

		int a = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				answer[a++] = arr[i][j];
			}
		}

		return answer;
	}
}
// 로또의 최고 순위와 최저 순위
class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] rank = { 6, 6, 5, 4, 3, 2, 1 };
		int count = 0;
		int zero = 0;

		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0) {
				zero++;
			} else {
				for (int j = 0; j < win_nums.length; j++) {
					if (lottos[i] == win_nums[j]) {
						count++;
					}
				}
			}
		}

		int[] answer = { rank[count + zero], rank[count] };
		return answer;
	}
}
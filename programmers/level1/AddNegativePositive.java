// 음양 더하기
class Solution {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;

		for (int i = 0; i < absolutes.length; i++) {
			if (signs[i] == false) { // 음수
				answer -= absolutes[i];
			} else { // 양수
				answer += absolutes[i];
			}
		}

		return answer;
	}
}
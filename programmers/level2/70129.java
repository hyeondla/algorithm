// 이진 변환 반복하기
class Solution {
	public int[] solution(String s) {

		int[] answer = new int[2];

		while (!s.equals("1")) {
			int c = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1') {
					c++;
				} else {
					answer[1]++;
				}
			}

			s = Integer.toBinaryString(c);
			answer[0]++;
		}

		return answer;
	}
}
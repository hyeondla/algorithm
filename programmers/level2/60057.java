// 문자열 압축
class Solution {
	public int solution(String s) {
		int answer = s.length();

		for (int cut = 1; cut <= s.length() / 2; cut++) {
			String tmp = s.substring(0, cut);
			String str = tmp;
			int count = 1;

			for (int i = cut; i < s.length(); i += cut) {
				int end = i + cut;
				if (i + cut > s.length()) {
					end = s.length();
				}

				String sub = s.substring(i, end);
				if (tmp.equals(sub)) {
					count++;
				} else { // 압축 불가
					if (count > 1) {
						str += count;
					}
					count = 1; // 초기화
					str += sub;
				}
				tmp = sub;
			}
			if (count > 1) {
				str += count;
			}
			answer = answer > str.length() ? str.length() : answer;
		}
		return answer;
	}
}
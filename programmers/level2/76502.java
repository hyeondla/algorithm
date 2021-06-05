// 괄호 회전하기
import java.util.Stack;

class Solution {
	public int solution(String s) {
		
		int answer = 0;

		for (int k = 0; k < s.length(); k++) {
			
			Stack<Character> stack = new Stack<>();
			
			for (int i = 0; i < s.length(); i++) {
				if (stack.empty()) {
					stack.push(s.charAt(i));
					continue;
				}
				
				if (s.charAt(i) == ')' && stack.peek() == '(') {
					stack.pop();
				} else if (s.charAt(i) == '}' && stack.peek() == '{') {
					stack.pop();
				} else if (s.charAt(i) == ']' && stack.peek() == '[') {
					stack.pop();
				} else {
					stack.push(s.charAt(i));
				}
			}
			
			if (stack.empty()) {
				answer++;
			}
			
			s += s.charAt(0);
			s = s.substring(1);
			
		}
		
		return answer;
		
	}
}
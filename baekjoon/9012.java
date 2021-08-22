import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<t; i++) {
			
			String str = sc.nextLine();
			Queue<Character> q = new LinkedList<Character>();
			
			for(int j=0; j<str.length(); j++) {
				
				if(str.charAt(j) == '(') {
					q.offer(str.charAt(j)); // 큐에 삽입
				} else if(str.charAt(j) == ')'){
					if(q.isEmpty()) { // 비어있을 경우 => 올바르지 않은 괄호 문자열
						q.offer(str.charAt(j));
						break;
					} else { // 큐에 괄호 '('이 있는 경우
						q.poll(); // 반환하고 삭제
					}
				}
				
			}
			// 비어있으면 올바른 괄호 문자열
			System.out.println(q.isEmpty() ? "YES" : "NO"); 
		}
		sc.close();
	}
}

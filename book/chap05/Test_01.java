import java.util.*;

public class ForCodingTest_5_01 {

	public static void main(String[] args) {

		// 스택 Fitst In Last Out
		// 언더플로우, 오버플로우 발생 가능

		Stack<Integer> s = new Stack<>();

		Scanner sc = new Scanner(System.in);

		int choose, num;
		while (true) {
			System.out.println("1:삽입 2:삭제 3:종료");
			choose = sc.nextInt();
			if (choose == 1) {
				num = sc.nextInt();
				s.push(num);
			} else if (choose == 2) {
				s.pop();
			} else {
				break;
			}
		}

		while (!s.empty()) { // empty→true
			System.out.println(s.peek()); // 최근 추가된 데이터 조회
			s.pop();
		}

	}

}

import java.util.*;

public class ForCodingTest_5_02 {

	public static void main(String[] args) {

		// 큐 Fitst In First Out
		// 언더플로우, 오버플로우 발생 가능

		Queue<Integer> q = new LinkedList<>();

		Scanner sc = new Scanner(System.in);

		int choose, num;
		while (true) {
			System.out.println("1:삽입 2:삭제 3:종료");
			choose = sc.nextInt();
			if (choose == 1) {
				num = sc.nextInt();
				q.offer(num); // 삽입
			} else if (choose == 2) {
				q.poll(); // 반환하고 삭제
			} else {
				break;
			}
		}

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}

}

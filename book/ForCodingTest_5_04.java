import java.util.*;

public class ForCodingTest_5_04 {

	public static int num;

	public static void recursiveFunction(int i) {

		if (i == num) {
			System.out.println("재귀함수 " + i + "번째 실행 => 종료");
			return;
		}

		System.out.println("재귀함수 " + i + "번째 실행");
		recursiveFunction(i + 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		// 재귀함수
		recursiveFunction(1);

	}

}

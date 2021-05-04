
public class ForCodingTest_8_01 {

	// 피보나치 -> 재귀함수로 구현
	public static int Fibo(int x) {

		if (x == 1 || x == 2) {
			return 1;
		}

		return Fibo(x - 1) + Fibo(x - 2);

	}

	public static void main(String[] args) {

		System.out.println(Fibo(10));

	}

}

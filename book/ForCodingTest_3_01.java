import java.util.*;

public class ForCodingTest_3_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int count = 0;
		int[] coin = { 500, 100, 50, 10 };

		for (int i = 0; i < coin.length; i++) {
			count += money / coin[i];
			money %= coin[i];
		}
		System.out.println(count);
	}

}

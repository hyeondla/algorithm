package chap11;

import java.util.*;

public class Test_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		int sum = str.charAt(0) - '0';

		for (int i = 0; i < str.length() - 1; i++) {

			int num1 = str.charAt(i) - '0';
			int num2 = str.charAt(i + 1) - '0';

			if (num1 == 0) {
				sum += num2;
			} else if (num2 == 0) {
				sum += num1;
			} else {
				sum *= num2;
			}

		}

		System.out.println(sum);

	}

}

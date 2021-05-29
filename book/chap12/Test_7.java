package chap12;

import java.util.Scanner;

public class Test_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String num = sc.next();

		int len = num.length();
		int left = 0, right = 0;

		for (int i = 0; i < len; i++) {
			if (i < len / 2) {
				left += num.charAt(i) - '0';
			} else {
				right += num.charAt(i) - '0';
			}
		}

		if (left == right) {
			System.out.println("LUCKY");
		} else {
			System.out.println("READY");
		}

	}

}

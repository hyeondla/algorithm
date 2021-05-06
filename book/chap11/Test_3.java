package chap11;

import java.util.*;

public class Test_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int cnt_0 = 0;
		int cnt_1 = 0;

		if (str.charAt(0) == '0') {
			cnt_0++;
		} else {
			cnt_1++;
		}

		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) != str.charAt(i + 1)) {
				if (str.charAt(i + 1) == '1') {
					cnt_0++;
				} else {
					cnt_1++;
				}
			}

		}

		System.out.println(Math.min(cnt_0, cnt_1));

	}

}

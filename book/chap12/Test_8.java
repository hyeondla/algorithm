package chap12;

import java.util.Scanner;

public class Test_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		int[] count = new int[91];
		int sum = 0;
		String str = "";

		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				count[(int) input.charAt(i)]++;
			} else {
				sum += input.charAt(i) - '0';
			}
		}

		for (int i = 65; i <= 90; i++) {
			if (count[i] != 0) {
				for (int j = 0; j < count[i]; j++) {
					str += (char) i;
				}
			}
		}
		
		System.out.println(str + sum);

	}

}

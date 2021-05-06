package chap11;

import java.util.*;

public class Test_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int group = 0;
		int person = 0;
		for (int i = 0; i < n; i++) {

			person++;
			
			if (person >= arr[i]) {
				group++;
				person = 0;
			}

		}

		System.out.println(group);

	}

}

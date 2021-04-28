import java.util.*;

public class ForCodingTest_4_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String start = sc.nextLine();

		int x = start.charAt(1) - '0';
		int y = start.charAt(0) - 'a' + 1;

		int cnt = 0;

		int[] act_x = { -1, -1, 1, 1, -2, -2, 2, 2 };
		int[] act_y = { -2, 2, -2, 2, -1, 1, -1, 1 };

		for (int i = 0; i < act_x.length; i++) {
			int move_x = x + act_x[i];
			int move_y = y + act_y[i];

			if ((move_x >= 1 && move_x <= 8) && (move_y >= 1 && move_y <= 8)) {
				cnt++;
			}

		}

		System.out.println(cnt);
	}

}

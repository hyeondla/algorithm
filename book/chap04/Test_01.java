import java.util.*;

public class ForCodingTest_4_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		String[] move = sc.nextLine().split(" ");
		int x = 1, y = 1;

		for (int i = 0; i < move.length; i++) {

			switch (move[i]) {

			case "L":
				if (y != 1) {
					y--;
				}
				break;

			case "R":
				if (y != n) {
					y++;
				}
				break;

			case "U":
				if (x != 1) {
					x--;
				}
				break;

			case "D":
				if (x != n) {
					x++;
				}
				break;

			default:
				break;

			}

		}

		System.out.printf("%d %d\n", x, y);

	}

}

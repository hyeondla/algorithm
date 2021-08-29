// 뒤집기
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int cntZero = 0; 
		int cntOne = 0;

		if (str.charAt(0) == '1') {
			cntZero++;
		} else {
			cntOne++;
		}

		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) != str.charAt(i + 1)) {
				if (str.charAt(i + 1) == '1') {
					cntZero++;
				} else {
					cntOne++;
				}
			}

		}

		System.out.println(Math.min(cntZero, cntOne));

	}

}

import java.util.*;

public class ForCodingTest_7_01 {

	// 순차 탐색
	public static int sequantialSearch(int n, String name, String[] str) {

		for (int i = 0; i < n; i++) {
			if (str[i].equals(name)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		String[] str = { "Haneul", "Jonggu", "Dongbin", "Taeil", "Sangwook" };

		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 이름을 입력하세요");
		String name = sc.next();

		int nameIndex = sequantialSearch(str.length, name, str);
		if (nameIndex == -1) {
			System.out.println("찾을 수 없습니다");
		} else {
			System.out.println((nameIndex + 1) + "번째에 있습니다");
		}

	}

}

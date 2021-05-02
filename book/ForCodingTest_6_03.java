
public class ForCodingTest_6_03 {

	public static void main(String[] args) {

		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		// 삽입 정렬 => 적절한 위치를 찾아 삽입
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				} else {
					break;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}


public class ForCodingTest_6_01 {

	public static void main(String[] args) {

		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		// 선택 정렬 => 가장 작은 데이터를 맨 앞의 데이터와 바꿈
		for (int i = 0; i < arr.length; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min_index] > arr[j]) {
					min_index = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = tmp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

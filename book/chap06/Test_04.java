
public class ForCodingTest_6_04 {

	public static void main(String[] args) {

		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		quickSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	// 퀵 정렬 => 피벗 기준으로 왼쪽은 작은 데이터, 오른쪽은 큰 데이터로 분할 후 정렬
	private static void quickSort(int[] arr, int start, int end) {

		if (start >= end) { // 데이터가 1개일 때 종료
			return;
		}

		int pivot = start;
		int left = start + 1;
		int right = end;

		while (left <= right) {

			// 피벗보다 큰 데이터 위치 찾기
			while (left <= end && arr[left] <= arr[pivot]) {
				left++;
			}

			// 피벗보다 작은 데이터 위치 찾기
			while (right > start && arr[right] >= arr[pivot]) {
				right--;
			}

			if (left > right) { // 엇갈림 -> 작은 데이터와 피벗 위치 바꿈
				int tmp = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = tmp;
			} else { // 작은 데이터와 큰 데이터 위치 바꿈
				int tmp = arr[left];
				arr[left] = arr[right];
				arr[right] = tmp;
			}

		}
		// 피벗 왼쪽에는 피벗보다 작은 데이터, 오른쪽에는 피벗보다 큰 데이터로 분할 완료
		// => 왼쪽과 오른쪽 각각 퀵소트
		quickSort(arr, start, right - 1);
		quickSort(arr, right + 1, end);

	}

}

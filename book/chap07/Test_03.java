import java.util.Scanner;

public class ForCodingTest_7_03 {
	// 이진 탐색 (반복문)
	public static int binarySearch(int[] arr, int num, int start, int end) {

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == num) {
				return mid;
			} else if (arr[mid] > num) { // 중간점 값보다 찾는 값이 작을 경우
				end = mid - 1;
			} else { // 중간점 값보다 찾는 값이 클 경우
				start = mid + 1;
			}

		}

		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };

		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 숫자을 입력하세요");
		int num = sc.nextInt();

		int numIndex = binarySearch(arr, num, 0, arr.length - 1);

		if (numIndex == -1) {
			System.out.println("찾는 숫자가 없습니다");
		} else {
			System.out.println((numIndex + 1) + "번째에 있습니다");
		}
	}

}

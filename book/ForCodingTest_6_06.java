
public class ForCodingTest_6_06 {

	public static final int MAX_VALUE = 9;

	public static void main(String[] args) {

		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2 };
		int[] count = new int[MAX_VALUE + 1];

		// 계수 정렬 
		// - 모든 범위를 담을 수 있는 크기의 배열 선언, 0으로 초기화
		// - 데이터 값과 동일한 인덱스의 데이터 1씩 증가
		// - 데이터가 정수일 경우에만 사용 가능
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		for (int i = 0; i <= MAX_VALUE; i++) {
			for (int j = 0; j < count[i]; j++) {
				System.out.print(i + " ");
			}
		}

	}

}

import java.util.*;

class Solution {
	public int[] solution(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[201];

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int sum = numbers[i] + numbers[j];
				arr[sum]++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				list.add(i);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
// 자물쇠와 열쇠
class Solution {
	public boolean solution(int[][] key, int[][] lock) {
		int[][] arr = new int[lock.length * 3][lock.length * 3];
		for (int i = 0; i < lock.length; i++) {
			for (int j = 0; j < lock.length; j++) {
				arr[i + lock.length][j + lock.length] = lock[i][j];
			}
		}

		for (int i = 0; i < 4; i++) {
			key = rotate(key);
			if (unlock(arr, key)) {
				return true;
			}
		}
		return false;
	}

	public static int[][] copyLock(int[][] arr) {
		int[][] copyArr = new int[arr.length][arr.length];
		for (int i = arr.length / 3; i < arr.length / 3 * 2; i++) {
			for (int j = arr.length / 3; j < arr.length / 3 * 2; j++) {
				copyArr[i][j] = arr[i][j];
			}
		}
		return copyArr;
	}

	public static int[][] rotate(int[][] arr) {
		int[][] rArr = new int[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				rArr[i][j] = arr[arr.length - 1 - j][i];
			}
		}
		return rArr;
	}

	public static boolean check(int[][] arr) {
		int check = 1;
		for (int i = arr.length / 3; i < arr.length / 3 * 2; i++) {
			for (int j = arr.length / 3; j < arr.length / 3 * 2; j++) {
				check *= arr[i][j];
				if (check != 1)
					return false;
			}
		}
		return true;
	}

	public static boolean unlock(int[][] arr, int[][] key) {
		for (int i = arr.length / 3 - key.length + 1; i < arr.length / 3 * 2; i++) {
			for (int j = arr.length / 3 - key.length + 1; j < arr.length / 3 * 2; j++) {
				int[][] lock = copyLock(arr);
				for (int p = 0; p < key.length; p++) {
					for (int q = 0; q < key.length; q++) {
						lock[i + p][j + q] += key[p][q];
					}
				}
				if (check(lock))
					return true;
			}
		}
		return false;
	}
}
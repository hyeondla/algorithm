// 좌표 정렬하기 2

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[][] arr = new int[n][2]; // y,x

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			arr[i][1] = Integer.parseInt(st.nextToken()); // x
			arr[i][0] = Integer.parseInt(st.nextToken()); // y
		}
		bf.close();

		Arrays.sort(arr, (arr1, arr2) -> {
			if (arr1[0] == arr2[0]) { // y 동일한 경우
				return arr1[1] - arr2[1]; // x 오름차순 정렬
			} else {
				return arr1[0] - arr2[0]; // y 오름차순 정렬
			}
		});
		;

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < n; i++) {
			 bw.write(arr[i][1] + " " + arr[i][0] + "\n");
		}
		bw.flush();
		bw.close();
	}
}

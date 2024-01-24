// 프린터 큐

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
		int num = Integer.parseInt(bf.readLine());

		while (num-- > 0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			LinkedList<int[]> q = new LinkedList<>();
			st = new StringTokenizer(bf.readLine());
			for (int i = 0; i < n; i++) {
				q.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
			}

			int cnt = 0;
			while (!q.isEmpty()) {
				int[] front = q.poll();
				cnt++;

				// 중요도가 더 높은 문서가 있는지 확인
				int max = front[1];
				int maxIdx = -1;
				for (int i = 0; i < q.size(); i++) {
					int[] tmp = q.get(i);
					if (max < tmp[1]) {
						maxIdx = i;
						max = tmp[1];
					}
				}
				// 중요도가 더 높은 문서가 있는 경우
				if (maxIdx != -1) {
					// 문서 뒤로 재배치
					q.offer(front);
					for (int i = 0; i < maxIdx; i++) {
						q.offer(q.poll());
					}
					front = q.poll(); // 중요도가 가장 높은 문서
				}

				if (front[0] == m) {
					System.out.println(cnt);
					break;
				}
			}
		}
		bf.close();
	}
}

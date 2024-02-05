import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int recentNum = 0;
		Stack<Integer> s = new Stack<>();
		StringBuilder sb = new StringBuilder();
		while (num-- > 0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			if (x > recentNum) {
				for (int i = recentNum + 1; i <= x; i++) {
					s.push(i);
					sb.append("+\n");
				}
				recentNum = x;
			}

			if (s.pop() == x) {
				sb.append("-\n");
			} else {
				System.out.println("NO");
				return;
			}

		}
		bf.close();

		System.out.println(sb);
	}
}

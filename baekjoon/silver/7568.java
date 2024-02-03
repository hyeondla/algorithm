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
		int[][] arr = new int[num][2];
		
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[i][0] = x;
			arr[i][1] = y;
		}
		
		bf.close();
		
		String answer = "";
		for(int i=0; i<num; i++) {
			int cnt = 1;
			for(int j=0; j<num; j++) {
				if(i == j) continue; // 본인 비교 제외
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					cnt++;
				}
			}
			answer += cnt + " ";
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(answer);
		bw.flush();
		bw.close();
	}
}

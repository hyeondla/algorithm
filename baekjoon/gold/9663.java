import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static int n;
	public static int[] chess; // 체스판 -> i행에서 퀸의 열 위치 저장
	public static int count = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(bf.readLine()); // 퀸 개수
		chess = new int[n];
		bf.close();
		queen(0);
		System.out.println(count);
		
	}

	private static void queen(int row) {
		if(row == n) { // 모든 퀸을 놓은 경우
			count++; // 카운트 증가
			return;
		}
		for(int i=0; i<n; i++) {
			chess[row] = i; 
			if(check(row)) { // 퀸을 놓을 수 있는 경우
				queen(row+1); // 다음 행에 퀸 놓기
			}
		}
	}

	private static boolean check(int row) { // 해당 행의 퀸 체크
		for(int i=0; i<row; i++) {
			if(chess[row] == chess[i]) return false; // 같은 열에 있는 경우
			if(Math.abs(chess[row] - chess[i]) == (row - i)) return false; // 대각선에 있는 경우
		}
		return true;
	}

}

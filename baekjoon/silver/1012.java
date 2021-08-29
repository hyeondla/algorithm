import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] dx = {0, 1, 0, -1}; // 방향 
	public static int[] dy = {-1, 0, 1, 0}; // 상 우 하 좌
	public static int[][] field; // 밭
	
	public static void setBug(int x, int y) { // 배추 위치
		field[x][y] = 0;
		for(int i=0; i<4; i++) {
			// 방향에 따른 새 위치 
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 0 && nx < field.length && ny >= 0 && ny < field[0].length) { // 밭의 크기를 벗어나지 않는 위치
				if(field[nx][ny] == 0) { // 배추가 없는 경우
					continue;
				} else { // 배추가 있는 경우
					setBug(nx, ny);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(bf.readLine()); // 테스트 케이스 개수
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int m = Integer.parseInt(st.nextToken()); // 밭 가로길이
			int n = Integer.parseInt(st.nextToken()); // 밭 세로길이
			int k = Integer.parseInt(st.nextToken()); // 배추 개수
			int bugCount = 0; // 벌레 개수
			field = new int[m][n]; // 밭
			while(k-->0) { // 배추 위치 저장
				st = new StringTokenizer(bf.readLine());
				int x = Integer.parseInt(st.nextToken()); // 배추 가로 위치
				int y = Integer.parseInt(st.nextToken()); // 배추 세로 위치
				field[x][y] = 1;
			}
			
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if(field[i][j] == 1) {
						setBug(i, j); // 배추벌레
						bugCount++;
					}
				}
			}
			System.out.println(bugCount); // 답
		}
		bf.close();
	}	
}

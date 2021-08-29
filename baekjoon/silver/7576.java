import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Location {
	int x;
	int y;
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	
	public static int[][] farm;
	public static int[] dx = {0, 1, 0, -1}; // 방향 
	public static int[] dy = {-1, 0, 1, 0}; // 상 우 하 좌
	public static Queue<Location> q = new LinkedList<Location>();
	public static int unTomato;
	public static int day;
	
	public static void spread() {
		Location location = q.poll();
		int x = location.x;
		int y = location.y;
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx>=0 && ny>=0 && nx<farm.length && ny<farm[0].length) { // 밭을 벗어나지 않는 경우
				if(farm[nx][ny] == 0) { // 안익은 토마토가 있는 경우
					Location nLocation = new Location(nx, ny);
					q.offer(nLocation); // 큐에 삽입
					farm[nx][ny] = farm[x][y] + 1; // 밭 갱신
					day = farm[nx][ny]; // 일 갱신
					unTomato--; // 안익은 토마토 감소
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int m = Integer.parseInt(st.nextToken()); // 가로 길이
		int n = Integer.parseInt(st.nextToken()); // 세로 길이
		farm = new int[n][m]; // 밭
		for(int i=0; i<n; i++) { // 토마토 정보 저장
			st = new StringTokenizer(bf.readLine());
			for(int j=0; j<m; j++) {
				farm[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bf.close();
		
		unTomato = 0;
		day = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(farm[i][j] == 1) { // 익은 토마토가 있는 경우
					Location tLocation = new Location(i, j);
					q.offer(tLocation); // 큐에 삽입
				} else if(farm[i][j] == 0) { // 안익은 토마토가 있는 경우
					unTomato++; // 개수 증가
				}
			}
		}
		
		// 저장될 때부터 모든 토마토가 익어있는 상태
		if(unTomato == 0) { 
			System.out.println(0);
			return;
		} 
		// 익은 토마토가 없는 상태
		if(q.isEmpty()) { 
			System.out.println(-1);
			return;
		}
		
		// 익은 토마토 존재 + 안익은 토마토가 있는 상태
		while(!q.isEmpty()) { // 큐가 빌 때까지 반복
			spread();
		}
		
		if(unTomato != 0) { // 토마토가 모두 익지 못하는 상황
			System.out.println(-1);
		} else { // 모두 익을 때까지의 최소 날짜
			System.out.println(day-1);
		}
	}
}

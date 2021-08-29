import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Location {
	public int x;
	public int y;
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {

	public static int[] dx = {1, 0, -1, 0}; // 이동 방향
	public static int[] dy = {0, 1, 0, -1}; // 우 하 상 좌
	public static int[][] maze; // 미로 맵 저장
	public static boolean[][] visit; // 방문여부 저장
	
	public static void bfs(Location location) {
		Queue<Location> q = new LinkedList<Location>();
		q.offer(location); // 큐에 삽입
		while(!q.isEmpty()) { // 큐가 빌 때까지 반복
			Location pLocation = q.poll(); // 큐에서 꺼내기
			int x = pLocation.x; // 변수에 현재 위치 저장
			int y = pLocation.y; 
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx>=0 && nx<maze.length && ny>=0 && ny<maze[0].length) { // 맵을 벗어나지 않는 경우
					if(maze[nx][ny] != 0 && visit[nx][ny] == false) { // 길이 있고 방문하지 않은 경우
						Location nLocation = new Location(nx, ny); // 새로운 위치 객체 생성
						q.offer(nLocation); // 큐에 삽입
						maze[nx][ny] = maze[x][y] + 1; // 값 갱신
						visit[nx][ny] = true; // 방문처리
					}
				}
			}
    }
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken()); 
		int m = Integer.parseInt(st.nextToken());
		visit = new boolean[n][m];
		maze = new int[n][m];
		// 맵 저장
		for(int i=0; i<n; i++) {
			String map = bf.readLine();
			for(int j=0; j<m; j++) {
				maze[i][j] = map.charAt(j) - '0';
			}
		}
		bf.close();
		
		Location location = new Location(0, 0); // 시작 위치
		visit[0][0] = true;
		bfs(location);
		System.out.println(maze[n-1][m-1]);
		
	}
}

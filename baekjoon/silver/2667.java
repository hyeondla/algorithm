import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Location {
	public int x;
	public int y;
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	
	public static char[][] map;
	public static int[] dx = {0, 1, 0, -1}; // 이동방향
	public static int[] dy = {-1, 0, 1, 0}; // 상 우 하 좌
	public static int count;
	
	public static void bfs(int x, int y) {
		Queue<Location> q = new LinkedList<Location>();
		Location location = new Location(x, y); // 위치 정보 저장
		q.offer(location); // 큐에 삽입
		map[x][y] = '0'; // 방문처리
		count++; // 단지 개수 증가
		
		while(!q.isEmpty()) { // 큐가 빌 때까지 반복
			Location pLocation = q.poll(); // 큐에서 위치 정보 가져옴
			int px = pLocation.x; // 현재 위치
			int py = pLocation.y;
			for(int i=0; i<4; i++) { // 각 방향별 
				int nx = px + dx[i];
				int ny = py + dy[i];
				if(nx>=0 && nx<map.length && ny>=0 && ny<map.length) { // 맵을 벗어나지 않는 경우
					if(map[nx][ny] == '1') { // 방문하지 않은 아파트가 있는 경우
						Location nLocation = new Location(nx, ny);
						q.offer(nLocation); // 큐에 삽입
						map[nx][ny] = '0'; // 방문처리
						count++; // 단지 개수 증가
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); // 지도 크기
		map = new char[n][n]; // 정사각형
		for(int i=0; i<n; i++) { // 맵 정보 저장
			String str = bf.readLine();
			for(int j=0; j<n; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		bf.close();

		ArrayList<Integer> apt = new ArrayList<Integer>(); // 단지 배열 저장
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] == '1') { // 아파트가 있는 경우
					count = 0; // 초기화
					bfs(i,j); // 탐색 시작
					apt.add(count); // 단지 개수 저장
				}
			}
		}
		Collections.sort(apt); // 정렬
		System.out.println(apt.size()); // 단지 개수 출력
		for(int i=0; i<apt.size(); i++) {
			System.out.println(apt.get(i)); // 오름차순 출력
		}
    
	}
}

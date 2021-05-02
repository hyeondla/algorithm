import java.util.*;

class Node2 {

	private int x;
	private int y;

	public Node2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
}

public class ForCodingTest_5_11 {

	public static int[][] maze = new int[201][201];
	public static int n, m;
	
	public static int dx[] = { -1, 1, 0, 0 };
	public static int dy[] = { 0, 0, -1, 1 };

	public static int escape(int x, int y) {

		Queue<Node2> q = new LinkedList<>();
		q.offer(new Node2(x, y)); //삽입

		while (q.isEmpty() == false) {
			
			Node2 node = q.poll(); //맨 앞 데이터 반환, 삭제
			x = node.getX();
			y = node.getY();
			
			//상->하->좌->우 방문
			for (int i = 0; i < 4; i++) { 
				
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || nx >= n || ny < 0 || ny >= m) { //벽
					continue;
				}
				if (maze[nx][ny] == 0) { //괴물
					continue;
				}

				if (maze[nx][ny] == 1) { //길, 처음 방문
					maze[nx][ny] = maze[x][y] + 1;
					q.offer(new Node2(nx, ny)); //삽입
				}
				
			}
			
		}
		
		/*
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.printf("%2d ",maze[i][j]);
			}
			System.out.println();
		}
		*/
		
		return maze[n - 1][m - 1];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				maze[i][j] = str.charAt(j) - '0';
			}
		}

		System.out.println(escape(0, 0));

	}

}

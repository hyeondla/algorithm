// 뱀
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[][] board = new int[size + 1][size + 1];

		int apple = sc.nextInt();
		for (int i = 0; i < apple; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			board[x][y] = 1; // 사과 1
		}

		int turn = sc.nextInt();
		ArrayList<Change> info = new ArrayList<>();

		for (int i = 0; i < turn; i++) {
			int x = sc.nextInt();
			char c = sc.next().charAt(0);
			info.add(new Change(x, c));
		}

		// 동 남 서 북
		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { 1, 0, -1, 0 };
		int direction = 0; // 시작 -> 동쪽

		int x = 1; // 시작행
		int y = 1; // 시작열
		board[x][y] = -1; // 뱀 위치 -1 표시
		int time = 0;
		int turnIndex = 0;

		Queue<Location> q = new LinkedList<>(); // 큐
		q.offer(new Location(x, y));

		while (true) {

			time++; // 시간 증가

			int nx = x + dx[direction];
			int ny = y + dy[direction];

			if (nx >= 1 && ny >= 1 && nx <= size && ny <= size && board[nx][ny] != -1) { // 이동 성공

				if (board[nx][ny] == 0) { // 사과 없음
					Location tail = q.poll(); // 꼬리 위치
					board[tail.getX()][tail.getY()] = 0; // 제거
				}
				q.offer(new Location(nx, ny)); // 뱀 현재 위치 추가
				board[nx][ny] = -1;

				if (turnIndex < turn) {
					if (time == info.get(turnIndex).getTime()) { // 회전 시간
						char newDirection = info.get(turnIndex).getDirection();

						if (newDirection == 'L') { // 왼쪽
							direction = (direction + 3) % 4;
						} else { // 오른쪽
							direction = (direction + 1) % 4;
						}

						turnIndex++;
					}
				}

				x = nx;
				y = ny;

			} else { // 벽, 뱀
				break;
			}

		}

		System.out.println(time);

	}

}

class Change {
	private int time;
	private char direction;

	public Change(int time, char direction) {
		this.time = time;
		this.direction = direction;
	}

	public int getTime() {
		return time;
	}

	public char getDirection() {
		return direction;
	}
}

class Location {
	private int x, y;

	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

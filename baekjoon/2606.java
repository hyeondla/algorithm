import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static boolean[] visited; // 방문 확인
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	public static int count = 0;
	
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		visited[start] = true;
		
		while(!q.isEmpty()) { // 큐가 빌 때까지 반복
			int x = q.poll(); // 맨 앞의 값
			
			for(int i=0; i<graph.get(x).size(); i++) {
				int y = graph.get(x).get(i);
				// 연결된 방문하지 않은 노드를 큐에 삽입
				if(!visited[y]) { 
					q.offer(y);
					visited[y] = true;
					count++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		visited = new boolean[n+1];
		// 그래프 초기화
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		int con = sc.nextInt();
		while(con-->0) {
			int com1 = sc.nextInt();
			int com2 = sc.nextInt();
			graph.get(com1).add(com2); // 연결 정보 저장
			graph.get(com2).add(com1); // 양방향
		}
		
		bfs(1); // 1과 연결
		System.out.println(count);
        
		sc.close();
		
	}
}

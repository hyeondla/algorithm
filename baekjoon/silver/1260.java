import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static boolean[] visited; // 방문 정보 
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	// DFS
	public static void dfs(int x) {
		visited[x] = true;
		System.out.print(x + " "); // 출력
		for(int i=0; i<graph.get(x).size(); i++) {
			int y = graph.get(x).get(i);
			if(!visited[y]) {
				dfs(y);
			}
		}
	}
	
	// BFS
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		visited[start] = true;
		while(!q.isEmpty()) {
			int x = q.poll();
			System.out.print(x + " "); // 출력
			// 연결된 방문하지 않은 노드를 큐에 삽입
			for(int i=0; i<graph.get(x).size(); i++) {
				int y = graph.get(x).get(i);
				if(!visited[y]) {
					q.offer(y);
					visited[y] = true;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 정점 개수
		int m = sc.nextInt(); // 간선 개수
		int v = sc.nextInt(); // 시작 정점
		
		// 초기화
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		while(m-->0) {
			
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			// 노드 정보 저장 => 양방향
			graph.get(v1).add(v2);
			graph.get(v2).add(v1);
			
		}
		
		// 정렬
		for(int i=0; i<graph.size(); i++) {
			Collections.sort(graph.get(i)); 
		}
		
		visited = new boolean[n+1]; // 초기화
		dfs(v);
		System.out.println();
		visited = new boolean[n+1]; // 초기화
		bfs(v);
		System.out.println();
		
		sc.close();
		
	}
}

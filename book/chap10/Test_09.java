package chap10;
import java.util.*;
public class Test_09 {
	
	public static int v;
	public static int[] indegree = new int[501];
	public static int[] times = new int[501];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    
	public static void topologySort() {
		
		int[] result = new int[501]; 
		for (int i = 1; i <= v; i++) {
            result[i] = times[i]; //자신의 시간 입력
        }
		
		Queue<Integer> q = new LinkedList<>(); 

        // 진입차수가 0인 노드를 큐에 삽입
        for (int i = 1; i <= v; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int now = q.poll();
            for (int i = 0; i < graph.get(now).size(); i++) {
            	// 결과 테이블 갱신
            	result[graph.get(now).get(i)] = Math.max(result[graph.get(now).get(i)], result[now] + times[graph.get(now).get(i)]);
            	// 해당 원소와 연결된 노드들의 진입차수 -1 
                indegree[graph.get(now).get(i)]--;
                // 진입차수가 0이 되는 노드를 큐에 삽입
                if (indegree[graph.get(now).get(i)] == 0) {
                    q.offer(graph.get(now).get(i));
                }
            }
        }

        // 위상 정렬 수행 결과
        for (int i = 1; i<=v; i++) {
            System.out.println(result[i]);
        }
        
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		v = sc.nextInt();
		
		// 그래프 초기화
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<Integer>());
        }
        
        for(int i=1; i<=v; i++) {
        	int x = sc.nextInt();
        	times[i] = x;
        	while(true) {
        		x = sc.nextInt();
        		if(x==-1) {
        			break;
        		}
        		indegree[i]++;
        		graph.get(x).add(i);
        		
        	}
        }
        
        topologySort();
        
	}

}

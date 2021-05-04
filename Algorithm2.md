> 다익스트라 알고리즘

```java
//간단Ver. 
//1차원 리스트 선언, 단계마다 순차 탐색
import java.util.*;

class Node {
    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return this.index;
    }
    public int getDistance() {
        return this.distance;
    }
}

public class Main {

    public static final int INF = (int) 1e9; //무한
    //n 노드 개수, m 간선 개수, start 시작 노드 번호
    public static int n, m, start;
    //연결 노드 정보 배열
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    //방문 체크 배열
    public static boolean[] visited = new boolean[100001];
    //최단 거리 테이블
    public static int[] d = new int[100001];
    
    //방문하지 않은 노드 중에서 최단 거리가 가장 짧은 노드 번호 반환
    public static int getSmallestNode() {
        int min_value = INF;
        int index = 0; // 가장 최단 거리가 짧은 노드(인덱스)
        for (int i = 1; i <= n; i++) {
            if (d[i] < min_value && !visited[i]) {
                min_value = d[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void dijkstra(int start) {
        
        d[start] = 0; //시작 노드 초기화
        visited[start] = true; //방문처리
        
        for (int j = 0; j < graph.get(start).size(); j++) {
        	//시작 노드와 연결된 노드 갱신
            d[graph.get(start).get(j).getIndex()] = graph.get(start).get(j).getDistance();
        }
        // 시작 노드 제외 → (n-1)번 반복
        for (int i = 0; i < n - 1; i++) {
            // 최단 거리가 가장 짧은 노드 → 방문 처리
            int now = getSmallestNode();
            visited[now] = true;
            // 현재 노드와 연결된 다른 노드를 확인
            for (int j = 0; j < graph.get(now).size(); j++) {
                // 현재 노드를 거쳐서 다른 노드로 이동하는 거리
                int cost = d[now] + graph.get(now).get(j).getDistance();
                // 더 짧은 경우 → 갱신
                if (cost < d[graph.get(now).get(j).getIndex()]) {
                    d[graph.get(now).get(j).getIndex()] = cost;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        //그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Node>());
        }
        // 노드 a → 노드 b, 비용 c
        graph.get(a).add(new Node(b, c));
        			...
        
        // 최단 거리 테이블 초기화(무한)
        Arrays.fill(d, INF);
        
        dijkstra(start);
        
    }
    
}
```

1. 출발 노드 설정

2. 최단 거리 테이블 초기화

   → 출발 노드에서 다른 모든 노드로 가는 최단거리 무한 **(int) 1e9**으로 초기화 

3. 방문하지 않은 노드 중에서 최단 거리가 가장 짧은 노드 선택

4. 해당 노드를 거쳐 다른 노드로 가는 비용 계산 

   → **최단 거리 테이블 갱신**

5. 3~4 반복

특정 노드에서 출발, 다른 노드로 가는 각각의 최단 경로를 구함

한 단계당 하나의 노드에 대한 최단 거리를 확실히 찾음

음의 간선이 없을 때 정상 동작

그리디 알고리즘 → 매번 가장 비용이 적은 노드 선택 반복

시간복잡도 : *O(V²)* , *O(ElogV)*

<br>

> 플로이드 위셜 알고리즘



<br>
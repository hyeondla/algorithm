> Scanner

```java
import java.util.*;

public class Main {
	public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
       
        int scan = sc.nextInt(); //숫자 입력 받기
        
        sc.nextLine(); //버퍼 비우기
        String str = sc.nextLine(); //문자열 입력 받기
        //배열에 문자(공백구분) 받기
        String[] move = sc.nextLine().split(" "); 
        
        
	}
}
```
<br>
> 문자열에서 문자 하나 저장하기

```java
char c1 = str.charAt(0); //첫번째 글자
char c2 = str.charAt(1); //두번째 글자
```
<br>

> int 값으로 변환

```java
int x = str.charAt(0) - 'a' + 1; //알파벳 → 숫자 (a=1, b=2, ...)
int y = str.charAt(1) - '0'; //문자열 숫자 → 숫자 
```

<br>

> 배열 정렬

```java
Arrays.sort(arr);
```

작은 수 → 큰 수 

<br>

> 최대/최소값 찾기

```java
max_value = Math.max(a, b);
min_value = Math.min(a, b);
```

<br>

> 스택 Stack

```java
import java.util.*;

public class Main {
	public static void main(String[] args){
        
        Stack<Integer> s = new Stack<>();
        
        s.push(data); //데이터 삽입
        s.pop(); //데이터 삭제
        
        System.out.println(s.peek()); //최근 추가된 데이터 조회
        System.out.println(s.empty()); //empty→true
       
    }
}
```

Fitst In Last Out

언더플로우, 오버플로우 발생 가능

<br>

> 큐 Queue

```java
import java.util.*;

public class Main {
	public static void main(String[] args){
     	
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(data); //데이터 삽입
        System.out.println(q.peek()); //맨 앞 데이터 반환
        System.out.println(q.poll()); //데이터 반환하고 삭제
       
        System.out.println(q.isEmpty()); //empty→true
        
	}
}
```

Fitst In First Out

언더플로우, 오버플로우 발생 가능

<br>

> 인접 행렬

```java
public class Main {
	
	public static final int INF = 999999999;
	
    public static int[][] graph = {
        {data1, data2, data3},
        {data4, data5, data6},
        {data7, data8, data9}
    };
    
}
```

2차원 배열로 그래프 연결 관계 표현

<br>

> 인접 리스트

```java
class Node {
    
    private int index;
    private int distance;
    
    public Node(int index, int distance){
        this.index = index;
        this.distance = distance;
    }
    
    public void show() {
        System.out.print("(" + this.index + "," + this.distance + ")");
    }
}

public class MAin {
    //인접 리스트
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<node>>();
    
    public static void main(String[] args){
        //그래프 초기화
        for(int i = 0; i < 그래프 크기; i++){
            graph.add(new ArrayList<Node>());
        }
        
        //각 노드에 연결된 노드 정보 저장(노드, 거리)
        graph.get(노드).add(new Node(연결 노드, 거리));
        graph.get(노드).add(new Node(연결 노드, 거리));
        graph.get(노드).add(new Node(연결 노드, 거리));
        graph.get(노드).add(new Node(연결 노드, 거리));
        
        //그래프 출력
        for(int i = 0; i < 그래프 크기; i++){
            for(int j = 0; j < graph.get(i).size(); j++){
                graph.get(i).get(j).show();
            }
            System.out.println();
        }
    }
    
}
```

리스트로 그래프 연결 관계 표현

<br>

> DFS 깊이 우선 탐색

```java
import java.util.*;

public class MAin {

    public static boolean[] visited = new boolean[그래프 크기];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    
    public static void dfs(int x) {

		visited[x] = true; // 방문 처리
		System.out.print(x + " "); //경로 출력
		
		for (int i = 0; i < graph.get(x).size(); i++) {
			int y = graph.get(x).get(i);
			if (visited[y] == false) {
				dfs(y);
			}
		}

	}
    
    public static void main(String[] args) {
		
        //초기화
        for (int i = 0; i < 그래프 크기; i++) {
			graph.add(new ArrayList<Integer>());
		}
        
        //노드 정보 저장
        graph.get(노드).add(연결 노드);
        graph.get(노드).add(연결 노드);
        graph.get(노드).add(연결 노드);
        graph.get(노드).add(연결 노드);
        graph.get(노드).add(연결 노드);
        graph.get(노드).add(연결 노드);
        
   		dfs(시작 노드);
        
    }
   
}
```

1. 탐색 시작 노드를 스택에 삽입, 방문 처리

2. 스택의 최상단 노드에 방문하지 않은 인접 노드가 있으면 

   번호가 낮은 순으로 그 노드를 스택에 넣고 방문 처리

   → 인접 노드를 모두 방문했을 경우 스택에서 최상단 노드를 꺼냄

3. 더 이상 수행할 수 없을 때까지 2 반복

스택 자료구조에 기초  → 재귀 함수 이용

시간복잡도 : O(N)

<br>

> BFS 너비 우선 탐색

```java
import java.util.*;

public class MAin {
    
    public static boolean[] visited = new boolean[그래프 크기];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
  
    public static void bfs(int start) {
    	
        Queue<Integer> q = new LinkedList<>();
        q.offer(start); // 삽입
        visited[start] = true; // 방문 처리
        
        while(!q.isEmpty()) { // 큐가 빌 때까지 반복

        	int x = q.poll(); //맨 앞 데이터 반환하고 삭제
            System.out.print(x + " "); //출력
            
            //연결된 방문하지 않은 노드를 큐에 삽입
            for(int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if(visited[y] == false) {
                    q.offer(y); 
                    visited[y] = true;
                }
            }
            
        }
    }
    
    public static void main(String[] args) {

		// 그래프 초기화
        for (int i = 0; i < 그래프 크기; i++) {
            graph.add(new ArrayList<Integer>());
        }
        
        //노드 정보 저장
        graph.get(노드).add(연결 노드);
        graph.get(노드).add(연결 노드);
        graph.get(노드).add(연결 노드);
        graph.get(노드).add(연결 노드);
        graph.get(노드).add(연결 노드);
        graph.get(노드).add(연결 노드);
        
   		bfs(시작 노드);
        
    }
    
}
```

1. 탐색 시작 노드를 큐에 삽입, 방문 처리

2. 큐에서 노드를 꺼내 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 

   모두 큐에 삽입하고 방문 처리

3. 더 이상 수행할 수 없을 때까지 2 반복

가까운 노드부터 탐색

큐 자료구조에 기초 → 큐 이용

시간복잡도 :  O(N), 일반적인 경우 DFS보다 빠름

<br>


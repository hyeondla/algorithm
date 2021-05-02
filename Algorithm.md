> Scanner

```java
import java.util.*;

public class Main {
	public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
       
        int scan = sc.nextInt(); //숫자 입력 받기
        
        sc.nextLine(); //버퍼 비우기
        Strint str = sc.next(); //문자열 입력 받기
        String str = sc.nextLine(); //한 줄 입력 받기
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
Interger[] arr = new Integer[배열크기]; 
Arrays.sort(arr); //오름차순
Arrays.sort(arr, Collections.reverseOrder()); //내림차순
```

<br>

> **Comparable** 인터페이스

```java
import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int score;
    
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
    
    @Override
    // 해당 객체와 전달된 객체의 순서 비교
    public int compareTo(Student other){
    	if(this.score < other.score){
            return -1;
        }	   
        return 1;
    }
    
}

public class Main {
    public static void main(String[] args){
        
        List<Student> students = new ArrayList<>();
        
        students.add(new Student("name", score));
        students.add(new Student("name", score));
        students.add(new Student("name", score));
        
        Collections.sort(students);
        
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).getName() + " " + students.get(i).getScore());
        }
    }
}
```

기본 오름차순 정렬

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

시간복잡도 : *O(N)*

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

시간복잡도 :  *O(N)*, 일반적인 경우 DFS보다 빠름

<br>

> 선택 정렬

```java
for(int i = 0; i < arr.length; i++){
    int min_index = i;
    for(int j = i + 1; j < arr.length; j++){
        if(arr[min_index] > arr[j]){
            min_index = j;
        }
    }
    
    int tmp = arr[i];
    arr[i] = arr[min_index];
    arr[min_index] = tmp;
}
```

가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸기 반복

시간복잡도 : *O(N²)*

<br>

> 삽입 정렬

```java
for(int i = 1; i < n; i++){
	for(int j = 1; j > 0; j--){
		if(arr[j] < arr[j - 1]){
			int tmp = arr[j];
			arr[j] = arr[j - 1];
			arr[j - 1] = tmp;
		} else {
			break;
		}
	}
}
```

데이터가 거의 정렬되어 있을 때 효율적

두번째 데이터부터 판단

그 앞의 데이터는 이미 정렬되어 있음

→ 적절한 위치를 찾은 뒤 삽입

시간복잡도 : *O(N)*

<br>

> 퀵 정렬

```java
public class Main {
	
    public static void quickSort(int[] arr, int start, int end){
    	
        if (start >= end) return; //종료 조건
        
        int pivot = start; //첫번째 데이터 피벗으로 설정
        int left = start + 1;
        int right = end;
        
        while(left <= right){
            
            //피벗보다 큰 데이터 위치 찾기
            while(left <= end && arr[left] <= arr[pivot]) left++;
            //피벗보다 작은 데이터 위치 찾기
            while(right > start && arr[right] >= arr[pivot]) right--;
			
            if(left > right) { //엇갈림 -> 작은 데이터와 피벗 위치 바꿈
                int tmp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = tmp;
            } else { //작은 데이터와 큰 데이터 위치 바꿈
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
            
        }
        //피벗 왼쪽에는 피벗보다 작은 데이터, 오른쪽에는 피벗보다 큰 데이터로 분할 완료
		//=> 왼쪽과 오른쪽 각각 퀵소트
        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }
    
    public static void main(String[] args) {
        quickSort(arr, 0, arr.length - 1);
    }
}
```

1. 첫번째 데이터를 피벗으로 설정

2. 왼쪽에서부터 피벗보다 큰 데이터 선택,

   오른쪽에서부터 피벗보다 작은 데이터 선택,

   두 데이터의 위치 바꿈

3. 2 반복

   → 왼쪽에서부터 찾는 값과 오른쪽에서부터 찾는 값의 위치가 엇갈림

4. 작은 데이터와 피벗의 위치 바꿈

   → 피벗의 왼쪽에는 피벗보다 작은 데이터, 오른쪽에는 큰 데이터 위치 

5. 왼쪽 리스트 1~4 반복

6. 오른쪽 리스트 1~4 반복

재귀함수로 구현

종료 조건 : 현재 리스트의 데이터 개수가 1개일 때

시간복잡도 : *O(NlogN)*, 최악(이미 데이터가 정렬되어 있는)의 경우 *O(N²)*

<br>

> 계수 정렬

```java
public class Main {
	
    public static final int MAX_VALUE = 배열크기;
    
    public static void main(String[] args) {
        
    	int[] cnt = new int[MAX_VALUE + 1];
        
        for (int i = 0; i < n; i++) {
  	      cnt[arr[i]]++;
	    }
        
    }
}
```

1. 모든 범위를 담을 수 있는 크기의 배열 선언, 0으로 초기화

2. 데이터 하나씩 확인 

   → 데이터 값과 동일한 인덱스 데이터 1씩 증가

3. 첫번째 데이터부터 하나씩 그 값만큼 인덱스 출력

데이터의 크기 범위가 제한되어 정수 형태로 표현할 수 있을 때만 사용 가능

일반적으로 가장 큰 데이터와 가장 작은 데이터의 차이가 1,000,000 이하일 때 효과적

데이터가 많이 중복되어 있는 경우

시간복잡도 : *O(N + K)*

<br>

> 순차 탐색

```java
public class Main {
    public static int sequantialSearch(int n, String target, String[] arr) {
        for (int i = 0; i < n; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) { }
}
```

앞에서부터 데이터를 차례대로 확인

시간복잡도 : *O(N)*

<br>

> 이진 탐색

```java
public class Main {
    // 재귀 함수
    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) return -1;
        
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) { // 중간점 값보다 찾는 값이 작을 경우
            return binarySearch(arr, target, start, mid - 1);
        } else { // 중간점 값보다 찾는 값이 클 경우
            return binarySearch(arr, target, mid + 1, end);
        }
    }
    
    public static void main(String[] args) { }
}
```

```java
public class Main {
    //반복문
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) { // 중간점 값보다 찾는 값이 작을 경우
                end = mid - 1;
            } else { // 중간점 값보다 찾는 값이 클 경우
                start = mid + 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) { }
}
```

1. 시작점과 끝점 사이에 중간점을 정함

   소수점 이하 버림

2. 중간점의 데이터와 찾으려는 데이터 비교

   → 시작점이나 끝점을 옮김

3. 새로운 중간점을 정해 데이터 비교

4. 반복

배열 내부 데이터가 정렬되어 있어야 사용 가능

찾으려는 데이터와 중간점 위치에 있는 데이터를 반복 비교

재귀함수 / 반복문 으로 구현

시간복잡도 : *O(logN)* 

<br>

> 이진 탐색 트리

1. 부모 노드보다 왼쪽 자식 노드가 작음

2. 부모 노드보다 오른쪽 자식 노드가 큼

입력 데이터가 많거나 탐색 범위가 매우 넓은 경우

<br>


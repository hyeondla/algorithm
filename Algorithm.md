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

> 문자열 

```java
//문자열 자르기
str.substring(start); //start ~ 끝
str.substring(start,end); //start ~ (end-1)

//특정문자 위치 찾기
//발견되는 인덱스 리턴, 없을시 -1 리턴
str.indexOf("특정문자"); //앞에서부터 처음 발견
str.indexOf("특정문자", 시작위치); //시작위치부터 처음 발견
str.lastIndexOf("특정문자"); //뒤에서부터 처음 발견
```

<br>

> int 값으로 변환

```java
int x = str.charAt(0) - 'a' + 1; //알파벳 → 숫자 (a=1, b=2, ...)
int y = str.charAt(1) - '0'; //문자열 숫자 → 숫자 
```

<br>

> 진수 변환

```java
Integer.toBinaryString(num); //10진수 → 2진수
Integer.toOctalString(num); //10진수 → 8진수
Integer.toHexString(num); //10진수 → 16진수

Integer.parseInt(num, 2); //2진수 → 10진수
Integer.parseInt(num, 8); //8진수 → 10진수
Integer.parseInt(num, 16); //16진수 → 10진수
```

<br>

> 배열

```java
Interger[] arr = new Integer[배열크기]; 
Arrays.sort(arr); //오름차순 정렬
Arrays.sort(arr, Collections.reverseOrder()); //내림차순 정렬

Arrays.fill(arr, data); //일차원 배열 초기화
System.out.println(Arrays.toString(arr)); //문자열로 리턴
//이차원 배열 초기화
for(int i=0; i<n; i++){
    Arrays.fill(arr[i], data); 
}
//-------------------------------------------------
import java.util.ArrayList;

//인스턴스 생성 -> 자료형 생략시 형변환 필요
ArrayList<Integer> list = new ArrayList<Integer>();
ArrayList<String> list = new ArrayList<String>();

list.add(data); //값 입력, 추가
System.out.println(list.get(num)); //n번째 데이터 출력
System.out.println(list.size());//현재 배열 크기

//=================================================

//배열 복사 - 기본형
int[] newArr = Arrays.copyOf(arr, arr.length); //[0]~[length-1] 복사
int[] newArr = arr.clone();

//배열 복사 - 참조자료형
//각 요소 값을 clone() 생성 복사 후 배열에 추가

```

<br>

> List

```java
List<Integer> List = new ArrayList<Integer>();
list.add(데이터);
list.add(인덱스, 데이터); // 인덱스에 데이터 추가, 기존 데이터는 뒤로 밀려남
list.addAll(리스트);
list.set(인덱스, 데이터); // 인덱스에 데이터 덮어씀
list.remove(인덱스);
list.remove(list.indexOf(데이터));
System.out.println(list.isEmpty());
System.out.println(list.size());
System.out.println(list.get(인덱스)); // 인덱스에 저장된 데이터 리턴
System.out.println(list.indexOf(데이터)); // 데이터가 위치한 인덱스 리턴
System.out.println(list.lastIndexOf(데이터)); // 뒤에서부터 탐색

List subList = list.subList(시작인덱스, 끝인덱스); // 시작 ~ 끝-1 추출
Collections.sort(list); // 정렬, 같은 타입 요소만 가능
Collections.shuffle(list); // 무작위 섞기, 타입 무관

// 배열 → 리스트 변환
List nameList = Arrays.atList(배열);
List nameList = Arrays.atList(데이터1, 데이터2, ...);
```

저장 데이터 순서 유지, 저장 시점에서 자동으로 인덱스가 부여됨

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
    // 해당 객체와 전달된 객체 비교
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

> 집합자료형 **Set**

```java
HashSet<Integer> s = new HashSet<>();
TreeSet<Integer> s = new TreeSet<>(); 

s.add(data); // 값 추가
s.remove(data); // 값 삭제
s.clear(); // 모든 값 삭제
System.out.println(s.isEmpty()); // 비어있는지 확인
System.out.println(s.contains(data)); // 값 검색 → true/false 반환
System.out.println(s.size()); // 크기
```

순서를 유지하지 않는 데이터의 집합, 인덱스 사용 X

데이터 중복 제거

Set / List 계열 객체 복사 가능

TreeSet : 같은 타입 데이터, 오름차순 정렬

<br>

> **Iterator** 인터페이스

```java
public interface Iterator {
    //읽어 올 요소가 남아있는지 확인
	boolean hasNext(); //있으면 true, 없으면 false 리턴
    
    //다음 요소를 리턴
    Object next();
    
    //next()로 읽어온 요소 삭제
    void remove();
}
//=================================================
Iterator<Integer> iter = list.iterator();
Iterator<Integer> iter = set.iterator();

while(iter.hasNext()){
    System.out.println(iter.next());
}
```

컬렉션 프레임워크에서 저장된 요소를 읽어오는 방법을 표준화

자동으로 Index 관리

List, Set

<br>

> 스택 Stack

```java
import java.util.*;

public class Main {
	public static void main(String[] args){
        
        Stack<Integer> s = new Stack<>();
        Stack<Character> stack = new Stack<>();
        Stack<String> s = new Stack<>();
        
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

---

<br>

> 다이나믹 프로그래밍 (동적 계획법)

큰 문제를 작은 문제로 나눌 수 있고,

작은 문제에서 구한 답이 그것을 포함하는 큰 문제에서도 동일할 때 사용 가능

점화식 구현

1. 탑다운(메모이제이션) 방식

   한 번 구한 결과 저장 → 같은 식을 다시 호출하면 결과 가져옴

   재귀 함수를 이용

   큰 문제를 해결하기 위해 작은 문제 호출

2. 보텀업 방식

   단순 반복문 이용하여 소스코드 작성

   작은 문제부터 차근차근 답 도출

스택 크기 문제로 보텀업 권장

<br>

---

<br>

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
            // 현재 노드와 연결된 다른 노드 확인
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

시간복잡도 : *O(V²)* 

<br>

> 개선된 다익스트라 알고리즘

```java
//힙 사용
//우선순위 큐에 가장 가까운 노드 저장
import java.util.*;

class Node implements Comparable<Node> {

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

    @Override
    // 거리가 짧은 것이 높은 우선순위
    public int compareTo(Node other) {
        if (this.distance < other.distance) {
            return -1;
        }
        return 1;
    }
    
}

public class Main {

    public static final int INF = (int) 1e9; // 무한
    // n 노드 개수, m 간선 개수, start 시작 노드 번호
    public static int n, m, start;
    // 연결 노드 정보 배열
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    // 최단 거리 테이블
    public static int[] d = new int[100001];

    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        // 시작 노드 최단 경로 0, 큐 삽입
        pq.offer(new Node(start, 0));
        d[start] = 0;
        while(!pq.isEmpty()) { 
            
            // 최단 거리가 가장 짧은 노드 정보 꺼내기
            Node node = pq.poll();
            int dist = node.getDistance(); // 현재 노드까지의 거리 
            int now = node.getIndex(); // 현재 노드
            
            // 현재 노드가 처리된적 있으면 무시
            if (d[now] < dist) continue;
            
            // 현재 노드와 연결된 다른 노드 확인
            for (int i = 0; i < graph.get(now).size(); i++) {
                // 현재 노드를 거쳐서 다른 노드로 이동하는 거리
                int cost = d[now] + graph.get(now).get(i).getDistance();
          		// 더 짧은 경우 → 갱신
                if (cost < d[graph.get(now).get(i).getIndex()]) {
                    d[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(now).get(i).getIndex(), cost));
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        // 그래프 초기화
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

힙 : 우선순위 큐 구현에 사용

우선순위 큐 : 우선순위가 가장 높은 데이터를 먼저 삭제

우선순위 큐 구현 : 내부적으로 최소 힙 / 최대 힙 이용

- 최대 힙 : 우선순위가 가장 높은 데이터를 먼저 삭제

- **최소 힙** : 기본, 우선순위가 가장 낮은 데이터를 먼저 삭제 → 최단 경로 알고리즘에 이용

  (최소힙을 최대힙처럼 사용하는 방법 :

  우선순위 값에 음수 부호(-)를 붙임 → 우선순위 큐에서 꺼낼 때 다시 음수 부호(-)를 붙임)

- 리스트 : 삭제할때마다 모든 원소 확인해서 우선순위 가장 높은 것을 찾음 → 힙보다 느림

시간복잡도 : *O(ElogV)*

<br>

> 플로이드 위셜 알고리즘

```java
import java.util.*;

public class Main {
    
	public static final int INF = (int) 1e9;
    //n 노드 개수, m 간선 개수
    public static int n, m;
    public static int[][] graph = new int[501][501];
    
    public static void main(String[] args) {
		
        // 최단 거리 테이블 초기화(무한)
        for (int i = 0; i < 501; i++) {
            Arrays.fill(graph[i], INF);
            graph[i][i] = 0;
        }

        // 간선 정보 입력
        for (int i = 0; i < m; i++) {
            // 노드 a → 노드 b, 비용 c
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph[a][b] = c;
        }

        // 점화식
        for (int k = 1; k <= n; k++) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
                }
            }
        }
        
    }
}
```

모든 지점에서 다른 모든 지점까지의 최단 경로를 모두 구해야 하는 경우

2차원 리스트에 최단 거리 저장

노드의 개수가 적은 경우 이용

다이나믹 프로그래밍
$$
\text{점화식}: D_{ab} = min(D_{ab}, D_{ak}+D_{kb})
$$
→ 'A에서 B로 가는 최소 비용'과 'A에서 K를 거쳐 B로 가는 비용' 비교, 작은 값으로 갱신

시간 복잡도 : *O(N³)*

<br>

> 서로소 집합

```java
import java.util.*;

public class Main {

    // V 노드 개수, E 연산 개수
    public static int v, e;
    public static int[] parent = new int[100001]; // 부모 테이블
    
    // 특정 원소가 속한 집합 찾기
    public static int findParent(int x) {
        // 루트 노드를 찾을 때까지 재귀 호출
        if (x == parent[x]) {
            return x;
        }
        return parent[x] = findParent(parent[x]);
    }
    
    // 집합 합치기
    public static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        // 번호가 더 작은 원소가 부모 노드
        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }
    
    public static void main(String[] args) {
        
        // 부모를 자기 자신으로 초기화
        for (int i = 1; i <= v; i++) {
            parent[i] = i;
        }

        // Union 연산
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            unionParent(a, b);
        }

        // 각 원소가 속한 집합 출력
        for (int i = 1; i <= v; i++) {
            System.out.print(findParent(i) + " ");
        }
        System.out.println();

        // 부모 테이블 출력
        for (int i = 1; i <= v; i++) {
            System.out.print(parent[i] + " ");
        }
        System.out.println();
    }
    
}
```

트리 자료구조로 집합 표현

1. union 연산 확인 → 서로 연결된 두 노드 A, B 확인

   1. A와 B의 루트 노드 A', B' 찾기

   2. A'를 B'의 부모노드로 설정 (B'가 A'를 가리키도록 함)

      → 번호가 더 작은 원소가 부모 노드가 되도록 구현

2. 모든 union 연산을 처리할 때까지 1 반복

시간복잡도 : *O(V+M)* 

무방향 그래프 내에서 사이클 판별

1. 각 간선을 확인하며 두 노드의 루트 노드를 확인
   1. 루트 노드가 서로 다르면 union 연산
   2. 루트 노드가 같으면 사이클 有
2.  그래프의 모든 간선에 대해 1 반복

```java
boolean cycle = false;

//루트 노드가 같으면 사이클
if(findParent(a)==findParent(b)) {
	cycle = true;
} else {
    //루트 노드가 다르면 union
	unionParent(a, b);
}
```

<br>

> 크루스칼 알고리즘

```java
import java.util.*;

class Edge implements Comparable<Edge> {

    private int distance;
    private int nodeA;
    private int nodeB;

    public Edge(int distance, int nodeA, int nodeB) {
        this.distance = distance;
        this.nodeA = nodeA;
        this.nodeB = nodeB;
    }

    public int getDistance() {
        return this.distance;
    }
    public int getNodeA() {
        return this.nodeA;
    }
    public int getNodeB() {
        return this.nodeB;
    }

    // 거리가 짧은 것이 높은 우선순위
    @Override
    public int compareTo(Edge other) {
        if (this.distance < other.distance) {
            return -1;
        }
        return 1;
    }
}

public class Main {
    public static int v, e;
    public static int[] parent = new int[100001]; 
    public static ArrayList<Edge> edges = new ArrayList<>();
    public static int result = 0;
    
    public static int findParent(int x) {
        if (x == parent[x]) return x;
        return parent[x] = findParent(parent[x]);
    }
    
    public static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        if (a < b) parent[b] = a;
        else parent[a] = b;
    }
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= v; i++) {
            parent[i] = i;
        }
        
        edges.add(new Edge(cost, a, b));
                  ...
                      
        // 비용순 정렬
        Collections.sort(edges);
        
        // 간선 하나씩 확인
        for (int i = 0; i < edges.size(); i++) {
            int cost = edges.get(i).getDistance();
            int a = edges.get(i).getNodeA();
            int b = edges.get(i).getNodeB();
            // 사이클이 발생하지 않는 경우
            if (findParent(a) != findParent(b)) {
                unionParent(a, b); // union
                result += cost;
            }
        }
        
    }
}
```

신장 트리 : 모든 노드가 연결되면서 사이클이 존재하지 않는 부분 그래프

신장 트리 중에서 최소 비용으로 만들 수 있는 신장 트리를 찾는 알고리즘

가장 거리가 짧은 간선부터 차례대로 집합에 추가, 사이클 발생 간선 제외

1. 간선 데이터 오름차순 정렬
2. 사이클 발생시키는지 간선을 하나씩 확인
   1. 사이클 X → 최소 신장 트리에 포함 (union)
   2. 사이클 → 최소 신장 트리에 미포함
3. 모든 간선에 대해 2 반복

신장 트리에 포함되는 간선의 개수 = 노드 개수 - 1

시간복잡도 : *O(ElogE)*

<br>

> 위상 정렬

```java
import java.util.*;

public class Main {
    // V 노드 개수, E 간선 개수
	public static int v, e;
    // 모든 노드에 대한 진입차수
	public static int[] indegree = new int[100001];
    // 각 노드에 연결된 간선 정보
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    
    public static void topologySort() {
		
        ArrayList<Integer> result = new ArrayList<>(); // 큐에서 빠져나간 노드 번호 저장
        Queue<Integer> q = new LinkedList<>(); 

        // 진입차수가 0인 노드를 큐에 삽입
        for (int i = 1; i <= v; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int now = q.poll();
            result.add(now);
            for (int i = 0; i < graph.get(now).size(); i++) {
            	// 해당 원소와 연결된 노드들의 진입차수 -1 
                indegree[graph.get(now).get(i)]--;
                // 진입차수가 0이 되는 노드를 큐에 삽입
                if (indegree[graph.get(now).get(i)] == 0) {
                    q.offer(graph.get(now).get(i));
                }
            }
        }

        // 위상 정렬 수행 결과
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        
    }
    
    public static void main(String[] args) {
    
        // 그래프 초기화
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<Integer>());
        }
        
        // 간선 정보 입력
        graph.get(a).get(b); // a → b 노드 연결
        indegree[b]++; // b 노드 진입 차수 +1
        	...
                
        topologySort();
        
    }
}
```

순서가 정해져 있는 일련의 작업을 차례대로 수행할 때 사용

방향 그래프의 모든 노드를 방향성에 거스르지 않도록 순서대로 나열

진입차수 : 특정한 노드로 들어오는 간선의 개수

1. 진입차수가 0인 노드를 큐에 삽입
2. 큐가 빌 때까지 다음 반복
   1. 큐에서 원소를 꺼내 해당 노드에서 출발하는 간선을 그래프에서 제거
   2. 새로 진입차수가 0이 된 노드를 큐에 삽입

큐에서 빠져나간 노드 순서대로 출력

시간복잡도 : *O(V + E)*

<br>


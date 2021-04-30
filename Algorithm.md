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

> 스택

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

> 큐

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


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			
			int x1 = sc.nextInt(), y1 = sc.nextInt(), r1 = sc.nextInt();
			int x2 = sc.nextInt(), y2 = sc.nextInt(), r2 = sc.nextInt();
			// 실수형의 오차 범위 주의 -> 제곱근을 구하지 않고 정수로 비교
			int d = (int)Math.pow(Math.abs(x1-x2),2) + (int)Math.pow(Math.abs(y1-y2),2);
			// => 반지름의 합/차 제곱해서 비교
			if(Math.pow(r1+r2,2) > d && Math.pow(Math.abs(r1-r2),2) < d) { // 두 점에서 만나는 경우
				System.out.println(2);
			} else if(d == 0 && r1 == r2) { // 동심원인 경우
				System.out.println(-1);
			} else if(Math.pow(r1+r2,2) == d || Math.pow(Math.abs(r1-r2),2) == d) { // 한 점에서 만나는 경우
				System.out.println(1);
			} else { // 만나지 않는 경우
				System.out.println(0);
			}
			
		}
		sc.close();
	}
}

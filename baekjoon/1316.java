import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		int count = num;
		
		for(int i=0; i<num; i++) {
			
			String str = sc.nextLine();
			// a 97 ~ z 122
			boolean[] check = new boolean[123];

			for(int j=0; j<str.length(); j++) {
				
				if(check[(int)str.charAt(j)] == true) { // 이미 출력된 문자
					if(str.charAt(j) == str.charAt(j-1)) {
						continue; // 이어진 문자
					} else {
						count--;
						break; // 떨어진 문자
					}
				} else {
					check[(int)str.charAt(j)] = true;
				}
				
			}
			
		}
		System.out.println(count);
	}
}

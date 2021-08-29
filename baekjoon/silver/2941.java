import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int len = 0;
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(i != str.length()-1) {
				if(c == 'c') { // c= c-
	 				if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-') {
						len++; i++;
						continue;
					}
				} else if(c == 'd') { 
					if(str.charAt(i+1) == '-') { // d-
						len++; i++;
						continue;
					} else if(i != str.length()-2 && str.charAt(i+1) == 'z' && str.charAt(i+2) == '=') { // dz=
						len++; i+=2;
						continue;
					}
				} else if(c == 'l' || c == 'n') { // lj nj
					if(str.charAt(i+1) == 'j') {
						len++; i++;
						continue;
					}
				} else if(c == 's' || c == 'z') { // s= z=
					if(str.charAt(i+1) == '=') {
						len++; i++;
						continue;
					}
				}
			}
			
			len++;
		}
		
		System.out.println(len);
		
	}
}

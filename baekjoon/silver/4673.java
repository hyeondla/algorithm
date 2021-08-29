public class Main {

	public static void main(String[] args) {
	
		boolean[] check = new boolean[10100];
		
		for(int i=1; i<10001; i++) {
			int num = i;
			int sum = num + num/10000 + num/1000 + (num/100)%10 + (num%100)/10 + num%10;
			check[sum] = true;
		}
		
		for(int i=1; i<10001; i++) {
			if(!check[i]) {
				System.out.println(i);
			}
		}
		
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
			
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		
		int[] dpZero = new int[41];
		dpZero[0] = 1; dpZero[1] = 0;
		int[] dpOne = new int[41];
		dpOne[0] = 0; dpOne[1] = 1;
		
		for(int i=2; i<41; i++) {
			dpZero[i] = dpZero[i-2] + dpZero[i-1];
			dpOne[i] = dpOne[i-2] + dpOne[i-1];
		}
		
		while(t --> 0) {
			int n = Integer.parseInt(bf.readLine());
			System.out.println(dpZero[n] + " " + dpOne[n]);
		}
		
		bf.close();
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine()); 
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int distance = Math.abs(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));
			int x = (int)Math.sqrt(distance); // 거리의 제곱근
			if(distance == x*x) { 
				System.out.println(2*x - 1);
			} else if(distance > x*x && distance <= x*(x+1)) {
				System.out.println(2*x);
			} else {
				System.out.println(2*x + 1);
			}
		}
		bf.close();
		
	}
}

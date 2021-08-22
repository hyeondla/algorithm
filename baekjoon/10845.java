import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		int lastNum = -1;
		
		for(int i=0; i<n; i++) {
			
			String str = bf.readLine();
			String[] strArr = str.split(" ");
			
			if(strArr[0].equals("push")) {
				lastNum = Integer.parseInt(strArr[1]);
        q.add(lastNum);
			} else if(strArr[0].equals("pop")) {
				System.out.println(q.isEmpty() ? -1 : q.poll());
			} else if(strArr[0].equals("size")) {
				System.out.println(q.size());
			} else if(strArr[0].equals("empty")) {
				System.out.println(q.isEmpty() ? 1 : 0);
			} else if(strArr[0].equals("front")) {
				System.out.println(q.isEmpty() ? -1 : q.peek());
			} else if(strArr[0].equals("back")) {
				System.out.println(q.isEmpty() ? -1 : lastNum);
			}
			
		}
		
	}
}

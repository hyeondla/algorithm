import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0; i<n; i++) {
			
			String commandLine = bf.readLine();
			String[] command = commandLine.split(" ");
			
			if(command[0].equals("push")) {
				stack.push(Integer.parseInt(command[1]));
			} else if(command[0].equals("pop")) {
				System.out.println(stack.isEmpty() ? -1 : stack.pop());
			} else if(command[0].equals("size")) {
				System.out.println(stack.size());
			} else if(command[0].equals("empty")) {
				System.out.println(stack.isEmpty() ? 1 : 0);
			} else if(command[0].equals("top")) {
				System.out.println(stack.isEmpty() ? -1 : stack.peek());
			}
			
		}
		
	}
}

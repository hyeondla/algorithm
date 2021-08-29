import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());
		TreeSet<Integer> s = new TreeSet<Integer>();
		
		while(n-->0) {
			s.add(Integer.parseInt(bf.readLine()));
		}
		
		for(Integer i : s) {
			bw.write(i.toString());
			bw.newLine();
		}
		
		bf.close();
		bw.flush();
		bw.close();
		
	}
}

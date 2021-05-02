import java.util.*;

public class ForCodingTest_7_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		HashSet<Integer> s = new HashSet<>();
		for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            s.add(num);
        }
		
		int m = sc.nextInt();
        int[] req = new int[n];
        for (int i = 0; i < m; i++) {
            req[i] = sc.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
        	if (s.contains(req[i])) {
                System.out.print("yes ");
            }
            else {
                System.out.print("no ");
            }
        }
        
	}

}

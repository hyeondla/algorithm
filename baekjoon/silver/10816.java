import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashMap;

class Main {  
  public static void main(String args[]) throws IOException { 
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    String key;
    int value;
    StringTokenizer st = new StringTokenizer(bf.readLine());
    HashMap<String, Integer> map = new HashMap();
    for(int i=0; i<n; i++) {
      key = st.nextToken();
      map.put(key, map.getOrDefault(key,0)+1);
    }

    int m = Integer.parseInt(bf.readLine());
    String answer = "";
    st = new StringTokenizer(bf.readLine());
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for(int i=0; i<m; i++) {
      key = st.nextToken();
      bw.write(map.getOrDefault(key,0) + " ");
    }
    
    bw.flush();
    bw.close();
    bf.close();
  } 
}

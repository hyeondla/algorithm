import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {  
  public static void main(String args[]) throws IOException { 
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Deque<String> dq = new ArrayDeque<>();
    int n = Integer.parseInt(bf.readLine());
    String command;
    String x;
    String answer = "";
    for(int i=0; i<n; i++) {
      command = bf.readLine();
      if(command.contains("push")) {
        x = command.split(" ")[1];
        if(command.contains("front")) { // push_front
          dq.push(x);
        } else { // push_back
          dq.add(x);
        }
      } else {
        switch(command) {
          case "pop_front" :
            answer = (dq.peek()==null) ? "-1" : dq.poll();
            break;
          case "pop_back" :
            answer = (dq.peek()==null) ? "-1" : dq.pollLast();
            break;
          case "size" :
            answer = dq.size() + "";
            break;
          case "empty" :
            answer = (dq.peek()==null) ? "1" : "0";
            break;
          case "front" :
            answer = (dq.peek()==null) ? "-1" : dq.getFirst();
            break;
          case "back" :
            answer = (dq.peek()==null) ? "-1" : dq.getLast();
            break;
        }
        bw.write(answer+"\n");
      }
    }
    bf.close();
    bw.flush();
    bw.close();  
  } 
}

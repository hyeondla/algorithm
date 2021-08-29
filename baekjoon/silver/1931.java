import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Meeting implements Comparable<Meeting> {
	
	private int start;
	private int end;
	
	public Meeting(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}
	public int getEnd() {
		return end;
	}

	@Override
	public int compareTo(Meeting other) { // 종료 시간 기준 정렬
		if(this.end == other.end) { // 종료 시간 같을 경우
			if(this.start < other.start) { // 시작 시간 기준 정렬
				return -1;
			}
			return 1;
		}
		if(this.end < other.end) { 
			return -1;
		}
		return 1;
	}
	
}

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); // 회의 개수
		int answer = 0;
		List<Meeting> meetings = new ArrayList<Meeting>();
		// 회의 정보 입력
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int start = Integer.parseInt(st.nextToken()); // 시작 시간
			int end = Integer.parseInt(st.nextToken()); // 종료 시간
			meetings.add(new Meeting(start, end));
		}
		bf.close();
		Collections.sort(meetings); // 정렬
		int prev = meetings.get(0).getEnd(); // 이전 종료 시간
		for(int i=1; i<meetings.size(); i++) {
//			System.out.println(meetings.get(i).getStart() + " " + meetings.get(i).getEnd());
			if(meetings.get(i).getStart() >= prev) { // 시작 시간 >= 이전 종료 시간
				answer++;
				prev = meetings.get(i).getEnd(); // 이전 종료 시간 갱신
			}
		}
		System.out.println(answer+1);
	}
}

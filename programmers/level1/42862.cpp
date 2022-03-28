// 체육복

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
    // 초기화  
    vector<int> student(n+1, 1);
    student[0] = 0;
    int answer = 0;
    
    for(int i=0; i<lost.size(); i++) {
        student[lost[i]] = 0; // 도난
    }
    for(int i=0; i<reserve.size(); i++) {
        student[reserve[i]]++; // 여벌
    }
    
    for(int i=1; i<=n; i++) {
        if(student[i]==0) { // 없는 경우
            if(student[i-1]==2) { // 앞번호 빌리기
                student[i-1]--;
                student[i]++;
            } else if(student[i+1]==2) { // 뒷번호 빌리기
                student[i+1]--;
                student[i]++;
            }
        }
        if(student[i]>0) answer++;
    }
    
    return answer;
}

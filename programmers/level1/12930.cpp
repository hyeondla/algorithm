// 이상한 문자 만들기

#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    int idx = 0;
    for(int i=0; i<s.length(); i++) {
        if(s[i] == ' ') { // 공백
            idx = 0; // 초기화
            answer += ' ';
            continue;
        }
        answer += (idx%2 == 0) ? toupper(s[i]) : tolower(s[i]);
        idx++;
    }
    return answer;
}

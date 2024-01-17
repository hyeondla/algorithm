// 시저 암호

#include <string>
#include <vector>

using namespace std;

string solution(string s, int n) {
    string answer = "";
    for(int i=0; i<s.length(); i++) {
        if(s[i] == 32) answer += " "; // 공백
        if(s[i] >= 65 && s[i] <= 90) { // 대문자
            answer += (s[i]+n > 90) ? s[i]+n-26 : s[i]+n;
        }
        if(s[i] >= 97 && s[i] <= 122) { // 소문자
            answer += (s[i]+n > 122) ? s[i]+n-26 : s[i]+n;
        }
    }
    return answer;
}

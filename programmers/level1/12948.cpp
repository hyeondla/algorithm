// 핸드폰 번호 가리기

#include <string>
#include <vector>

using namespace std;

string solution(string phone_number) {
    int len = phone_number.length();
    string sub = phone_number.substr(len-4).c_str();
    string answer = "";
    for(int i=0; i<len-4; i++) {
        answer += '*';
    }
    answer += sub;
    
    return answer;
}

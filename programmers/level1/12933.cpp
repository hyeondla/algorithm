// 정수 내림차순으로 배치하기

#include <string>
#include <vector>

using namespace std;

long long solution(long long n) {
    string str_n = to_string(n);
    int num[10] = {0};
    for(int i=0; i<str_n.length(); i++) {
        num[str_n[i]-'0']++;
    }
    
    string str_answer = "";
    for(int i=9; i>=0; i--) {
        if(num[i] != 0) {
            for(int j=0; j<num[i]; j++) {
                str_answer += i + '0';
            }
        }
    }

    long long answer = stoll(str_answer);
    return answer;
}

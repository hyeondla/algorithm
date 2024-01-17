// 하샤드 수

#include <string>
#include <vector>

using namespace std;

bool solution(int x) {
    
    string str_x = to_string(x);
    int sum = 0;
    for(int i=0; i<str_x.length(); i++) {
        sum += str_x[i] - '0';
    }
    
    bool answer = (x % sum == 0) ? true : false;
    
    return answer;
}

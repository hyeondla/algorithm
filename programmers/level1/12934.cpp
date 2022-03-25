// 정수 제곱근 판별

#include <string>
#include <vector>
#include <cmath>

using namespace std;

long long solution(long long n) {
    auto i = sqrt(n);
    long long answer = -1;
    if(i == (int)i){ // 정수
        answer = powl(i+1,2);
    }
    
    return answer;
}

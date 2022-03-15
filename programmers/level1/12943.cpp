// 콜라츠 추측

#include <string>
#include <vector>

using namespace std;

int solution(int num) {
    int answer = 0;
    long n = num;
    if(n == 1) return 0;
    while(answer<500){
        n = (n % 2 == 0) ? n/2 : n*3+1; 
        answer++; 
        if(n == 1) break;
    }
    if(answer == 500) answer = -1;
    return answer;
}

// 두 정수 사이의 합

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

long long solution(int a, int b) {
    long long maxN = max(a,b);
    long long minN = min(a,b);
    long long answer = maxN*(maxN+1)/2 - minN*(minN-1)/2;
    return answer;
}

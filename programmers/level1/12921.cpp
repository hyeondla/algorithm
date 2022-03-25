// 소수 찾기

#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    vector<int> v(n+1, 0);
    for(int i=2; i<=n; i++) {
        if(v[i] == -1) continue; // -1인 경우 넘어감
        answer++;
        for(int j=i; j<=n;) {
            v[j] = -1; 
            j += i;
        }
    }
    return answer;
}

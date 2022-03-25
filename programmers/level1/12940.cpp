// 최대공약수와 최소공배수

#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(int n, int m) {
    vector<int> answer;
    answer.resize(2);
    pair<int,int> p = minmax(n,m); // p.first 최소값 p.second 최대값
    for(int i=1; i<=p.first; i++) {
        if(n%i==0 && m%i==0) {
            answer[0] = i;
        }
    }
    answer[1] = n * m /answer[0];
    return answer;
}

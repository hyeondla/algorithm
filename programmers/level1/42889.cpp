#include <string>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

bool cmp(const pair<int,double>& a, const pair<int,double>& b) {
    if(a.second == b.second) return a.first < b.first;
    return a.second > b.second;
}

vector<int> solution(int N, vector<int> stages) {
    vector<int> answer; 
    int player = stages.size(); // 플레이어 수
    double rate = 0; // 실패율
    
    int pStages[502] = {0}; // 스테이지당 플레이어 수 저장
    for(int i=0; i<player; i++) {
        pStages[stages[i]]++;
    }
    
    vector<pair<int,double>> fRates; // 스테이지당 실패율 저장
    for(int i=1; i<=N; i++) {
        if(player == 0) { // 도달한 유저가 없는 경우
            fRates.push_back(vector<pair<int,double>>::value_type(i, 0.0));
            continue;
        }
        fRates.push_back(vector<pair<int, double>>::value_type(i,(double)pStages[i]/player));
        player -= pStages[i];
    }
    
    sort(fRates.begin(), fRates.end(), cmp);
    
    for(auto s : fRates) {
        answer.push_back(s.first);
    }
    
    return answer;
}

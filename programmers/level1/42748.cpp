// K번째수

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer;
    for(int n=0; n<commands.size(); n++) {
        int i = commands[n][0];
        int j = commands[n][1];
        int k = commands[n][2];
        vector<int> v(array); // 복사
        sort(v.begin()+i-1, v.begin()+j); // 정렬
        answer.push_back(v[i+k-2]);
    }

    return answer;
}

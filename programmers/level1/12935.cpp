// 제일 작은 수 제거하기

#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr) {
    
    if(arr.size() == 1) return {-1};
    
    int min = arr[0];
    for(int i=1; i<arr.size(); i++) {
        min = (arr[i] < min) ? arr[i] : min;
    }
    
    vector<int> answer;
    for(int i=0; i<arr.size(); i++) {
        if(arr[i] != min) answer.push_back(arr[i]);
    }
    
    return answer;
}

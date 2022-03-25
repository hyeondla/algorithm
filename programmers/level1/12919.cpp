// 서울에서 김서방 찾기

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(vector<string> seoul) {
    
    // vector<string>::iterator iter = find(seoul.begin(), seoul.end(), "Kim");
    // int idx = distance(seoul.begin(), iter);
    int idx = find(seoul.begin(),seoul.end(),"Kim")-seoul.begin();
    string answer = "김서방은 " + to_string(idx) + "에 있다";
    
    return answer;
}

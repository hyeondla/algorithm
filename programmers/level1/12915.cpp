// 문자열 내 마음대로 정렬하기

#include <string>
#include <vector>
#include <algorithm>

using namespace std;
int idx;

bool compare(string s1, string s2) {
    if(s1[idx] != s2[idx]) return s1[idx]<s2[idx];
    else return s1<s2;
}

vector<string> solution(vector<string> strings, int n) {
    idx = n;
    sort(strings.begin(), strings.end(), compare);
    
    return strings;
}

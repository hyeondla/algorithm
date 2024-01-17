#include <string>
#include <vector>
#include <bitset>

#include <iostream>
using namespace std;

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    bitset<16> bs;
    for(int i=0; i<n; i++) {
        string s = "";
        bs.reset();
        bs = arr1[i] |= arr2[i];
        for(int k=n-1; k>=0; k--) {
            if(bs[k]) s+= "#";
            else s+= " ";
        }
        answer.push_back(s);
    }
    return answer;
}

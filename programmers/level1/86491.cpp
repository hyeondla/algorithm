#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> sizes) {
    int wMax=0, hMax=0;
    for(int i=0; i<sizes.size(); i++) {
        wMax = max(wMax, max(sizes[i][0], sizes[i][1]));
        hMax = max(hMax, min(sizes[i][0], sizes[i][1]));
    }
    return wMax * hMax;
}

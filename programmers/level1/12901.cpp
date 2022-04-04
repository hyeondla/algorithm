#include <string>
#include <vector>

using namespace std;

string solution(int a, int b) {
    string d[7] = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
    int ds[12] = {31,29,31,30,31,30,31,31,30,31,30,31};
    int dday = b;
    for(int i=0; i<a-1; i++) {
        dday += ds[i];
    }
    return d[dday%7];
}

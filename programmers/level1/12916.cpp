// 문자열 내 p와 y의 개수

#include <string>

using namespace std;

bool solution(string s)
{
    int pNum=0, yNum=0;
    
    for(int i=0; i<s.length(); i++) {
        if(s[i]=='p' || s[i]=='P') pNum++;
        if(s[i]=='y' || s[i]=='Y') yNum++;
    }
    
    return (pNum==yNum)?true:false;
}

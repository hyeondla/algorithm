// 다트 게임

#include <string>
#include <cctype>
#include <iostream>
#include <vector>

using namespace std;

int solution(string dartResult) {
    vector<int> score;
    vector<char> bonus(3), option(3);
    for(int i=0; i<dartResult.length(); i++) {
        if(isdigit(dartResult[i])) { // 숫자
            if(isdigit(dartResult[i+1])) { // 10
                score.push_back(10);
                i++;
            } else { // 0~9
                score.push_back(dartResult[i]-'0');
            }
        } else if(isalpha(dartResult[i])) { // 문자
            bonus[score.size()-1] = dartResult[i];
        } else { // 기호
            option[score.size()-1] = dartResult[i];
        }
    }
    
    for(int i=0; i<3; i++) {
        switch(bonus[i]) {
            case 'S': break;
            case 'D': score[i] = score[i] * score[i]; break;
            case 'T': score[i] = score[i] * score[i] * score[i]; break;
        }
        switch(option[i]) {
            case '*':
                score[i] = score[i] * 2;
                if(i>0) score[i-1] = score[i-1] * 2;
                break;
            case '#': score[i] = score[i] * -1; break;
        }
    }
    int answer = score[0] + score[1] + score[2];
      
    return answer;
}

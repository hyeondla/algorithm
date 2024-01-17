#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    sort(participant.begin(), participant.end());
    sort(completion.begin(), completion.end());
    
    for(int i=0; i<completion.size(); i++) {
        if(completion[i] != participant[i]) return participant[i];
    }
    return participant[participant.size()-1];
}

//=============================================================================

#include <string>
#include <vector>
#include <unordered_set>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    
    unordered_multiset<string> ms;
    for(int i=0; i<participant.size(); i++) {
        ms.insert(participant[i]);
    }
    
    for(int i=0; i<completion.size(); i++) {
        unordered_multiset<string>::iterator iter = ms.find(completion[i]);
        if(iter == ms.end()) {
            return completion[i];
        } else {
            ms.erase(iter);
        }
    }
    return *ms.begin();
}

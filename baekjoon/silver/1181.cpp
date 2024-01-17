#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

bool cmp(string a, string b) {
  if(a.length()<b.length()) return true;
  else if(a.length()>b.length()) return false;
  else return a < b;
}

int main() {
  vector<string> v;
  int n;
  char s[51];
  scanf("%d", &n);
  while(n-->0) {
    scanf("%s", &s);
    v.push_back(s);
  }

  sort(v.begin(), v.end(), cmp);
  printf("%s\n", v[0].c_str());
  for(int i=1; i<v.size(); i++) {
    if(v[i] != v[i-1]) {
      printf("%s\n", v[i].c_str());    
    }
  }
  
	return 0;
}

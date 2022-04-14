#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool cmp(pair<int,int> a, pair<int,int> b) {
  if (a.first > b.first) return false;
  else if (a.first < b.first) return true;
  else return a.second < b.second;
}

int main() {
  vector<pair<int,int>> v;
  int n, x, y;
  scanf("%d", &n);
  while(n-->0) {
    scanf("%d %d", &x,&y);
    v.push_back(make_pair(x,y));
  }
  
  sort(v.begin(), v.end(), cmp);
  for(int i=0; i<v.size(); i++) {
    printf("%d %d\n", v[i].first, v[i].second);
  }
  
	return 0;
}

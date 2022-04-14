#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
  int n, age;
  char name[51];
  vector<vector<string>> v(201);
  
  scanf("%d", &n);
  for(int i=0; i<n; i++) {
    scanf("%d %s", &age, &name);
    v[age].push_back(name);
  }

  for(int i=1; i<201; i++) {
    for(int j=0; j<v[i].size(); j++) {
      printf("%d %s\n", i, v[i][j].c_str());
    }
  }
  
	return 0;
}

//================================================

#include <iostream>
#include <vector>
#include <string>
#include <tuple>
#include <algorithm>

using namespace std;

bool cmp(tuple<int,int,string> a, tuple<int,int,string> b) {
  if(get<1>(a) < get<1>(b)) return true;
  else if(get<1>(a) > get<1>(b)) return false;
  else return get<0>(a) < get<0>(b);
}

int main() {
  vector<tuple<int,int,string>> v; // 가입번호, 나이, 이름
  int n, age;
  char name[51];
  scanf("%d", &n);
  for(int i=0; i<n; i++) {
    scanf("%d %s", &age, &name);
    v.push_back(make_tuple(i, age, name));
  }
  
  sort(v.begin(), v.end(), cmp);
  for(int i=0; i<n; i++) {
    printf("%d %s\n", get<1>(v[i]),get<2>(v[i]).c_str());
  }
  
	return 0;
}

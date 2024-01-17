#include <iostream>
#include <vector>

using namespace std;

int main() {

  int n, m, sum;
  scanf("%d %d", &n,&m);
  vector<int> cards(n);
  for(int i=0; i<n; i++) {
    scanf("%d", &cards[i]);
  }
  int sMax = 0;
  for(int i=0; i<n-2; i++) {
    for(int j=i+1; j<n-1; j++) {
      for(int k=j+1; k<n; k++) {
        sum = cards[i] + cards[j] + cards[k];
        if(sum == m) {
          printf("%d\n", m);
          return 0;
        } else if(sum < m) {
          sMax = max(sMax, sum);
        }
      }
    }
  }
  printf("%d\n", sMax);
  
  return 0;
}

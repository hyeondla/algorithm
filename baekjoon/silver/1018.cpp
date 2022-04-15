#include <iostream>
using namespace std;
int main() {
	int n,m;
  scanf("%d %d", &n, &m);
  char chess[51][51];
  for(int i=0; i<n; i++) {
    scanf("%s", &chess[i]);
  }

  int cntB,cntW;
  int answer = 64;
  for(int p=0; p<=n-8; p++) {
    for(int q=0; q<=m-8; q++) {
      cntB=0;
      cntW=0;
      for(int i=p; i<p+8; i++) {
        for(int j=q; j<q+8; j++) {
          //시작 B인 경우
          if((i+j)%2==0 && chess[i][j]=='W') cntB++;
          if((i+j)%2==1 && chess[i][j]=='B') cntB++;
          //시작 W인 경우
          if((i+j)%2==0 && chess[i][j]=='B') cntW++;
          if((i+j)%2==1 && chess[i][j]=='W') cntW++;
        }
      }
      answer = min(answer, cntB);
      answer = min(answer, cntW);
    }
  }
  printf("%d\n", answer);
  
	return 0;
}

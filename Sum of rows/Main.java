#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,s=0;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  for(int i=0;i<r;i++)
  {
    s=0;
    for(int j=0;j<c;j++)
      s=s+a[i][j];
    cout<<s<<endl;
  }
}
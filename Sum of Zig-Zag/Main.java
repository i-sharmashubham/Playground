#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,s=0;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<r;j++)
      cin>>a[i][j];
  for(int i=0;i<r;i++)
  {
    s=s+a[i][r-i-1];
  }
  for(int i=0;i<r-1;i++)
  {
    s=s+a[0][i];
    s=s+a[r-1][r-1-i];
  }
  cout<<"Sum of Zig-Zag pattern is "<<s;
}
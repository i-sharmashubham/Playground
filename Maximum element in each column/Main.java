#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,s;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  for(int i=0;i<c;i++)
  {
    s=0;
    for(int j=0;j<r;j++)
    {
      if(a[j][i]>s)
        s=a[j][i];
    }
    cout<<s<<endl;
  }
}
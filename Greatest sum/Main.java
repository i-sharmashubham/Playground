#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,m=0,t=0;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  cout<<"Sum of rows is ";
  m=0;
  for(int i=0;i<r;i++)
  {
    int s=0;
    for(int j=0;j<c;j++)
      s=s+a[i][j];
    cout<<s<<" ";
    if(s>m)
    {
      m=s;
      t=i+1;
    }
  }
  cout<<endl<<"Row "<<t<<" has maximum sum\nSum of columns is ";
  m=0;
  for(int i=0;i<c;i++)
  {
    int s=0;
    for(int j=0;j<r;j++)
      s=s+a[j][i];
    cout<<s<<" ";
    if(s>m)
    {
      m=s;
      t=i+1;
    }
  }
  cout<<endl<<"Column "<<t<<" has maximum sum";
}
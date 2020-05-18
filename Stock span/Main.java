#include <iostream>
using namespace std;
int main()
{
  int n,current;
  int prev=0,stock=2;
  cin>>n;
    for(int i=0;i<n;i++)
    {
      cin>>current;
      if(i==0)
      {
        cout<<"1"<<endl;
      }
      else if(prev>current)
      {
        cout<<"1"<<endl;
      }
      else
      {
        cout<<stock<<endl;
        stock=stock+2;
      }
      prev = current;
    }
}
#include<iostream>
using namespace std;
struct Length
{
  int f;
  float i;
};
int main()
{
  //Type your code here.
  Length l1,l2,l3;
  cin>>l1.f>>l1.i>>l2.f>>l2.i;
  l3.f=l1.f+l2.f;
  l3.i=l1.i+l2.i;
  if(l3.i>=12)
  {
    l3.i=l3.i-12;
    l3.f++;
  }
  cout<<l3.f<<"\'-"<<l3.i<<"\"";
}
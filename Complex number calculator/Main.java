#include<iostream>
using namespace std;
struct complex
{
  int r;
  int i;
};
int main()
{
  complex a,b,r;
  int c;
  cin>>c>>a.r>>a.i>>b.r>>b.i;
  switch(c)
  {
    case 1:
      r.r=a.r+b.r;
      r.i=a.i+b.i;
      (r.i<0)?cout<<r.r<<r.i<<'i':cout<<r.r<<'+'<<r.i<<'i';
      break;
    case 2:
      r.r=a.r-b.r;
      r.i=a.i-b.i;      
      (r.i<0)?cout<<r.r<<r.i<<'i':cout<<r.r<<'+'<<r.i<<'i';
      break;
    case 3:
      r.r=a.r*b.r - a.i*b.i;
      r.i=a.r*b.i + a.i*b.r;
      (r.i<0)?cout<<r.r<<r.i<<'i':cout<<r.r<<'+'<<r.i<<'i';
      break;
    default:cout<<"Invalid choice";
  }
}
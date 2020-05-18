#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
   string str;
  getline(cin,str);
  int i=0,w=0;
  while(str[i])
  {
    if(str[i]==' ')
      w++;
    i++;
  }
  if(w<10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
}
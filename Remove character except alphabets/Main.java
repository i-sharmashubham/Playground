#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  cin>>str;
  int i=0;
  while(str[i])
  {
    if(isalpha(str[i]))
       cout<<str[i];
    i++;
  }
}
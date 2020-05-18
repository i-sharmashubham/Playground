#include <iostream>
#include<string>
using namespace std;
int main()
{
string str;
  int c;
  getline(cin,str);
  while(str[c])
    c++;
  for(int i=c-1;i>=0;i--)
    cout<<str[i];
}
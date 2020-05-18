#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str1,str2,str3="";
  cin>>str1>>str2;
  for(string::reverse_iterator i=str1.rbegin();i<str1.rend();i++)
    str3=str3+*i;
  if(str2.compare(str3)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}
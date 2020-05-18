#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  cin>>str;
  cout<<str<<endl;
  char l=str[str.length()-1];
  do
  {
    cin>>str;
    if(str[0]==l)
      cout<<str<<endl;
    l=str[str.length()-1];
  }while(str.compare("####"));
}
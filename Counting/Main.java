#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  getline(cin,str);
  int v=0,c=0,w=0,d=0,s=0,i=0;
  while(str[i])
  {
    if(isalpha(str[i]))
       {
         if((str[i]=='a')||(str[i]=='A')||(str[i]=='e')||(str[i]=='E')||(str[i]=='i')||(str[i]=='I')||(str[i]=='o')||(str[i]=='O')||(str[i]=='u')||(str[i]=='U'))
           v++;
         else
           c++;
       }
     else if(str[i]==' ')
       w++;
     else if(isdigit(str[i]))
       d++;
     else
       s++;
    i++;
  }
  cout<<"Vowels:"<<v<<endl<<"Consonants:"<<c<<endl<<"White Spaces:"<<w<<endl<<"Digits:"<<d<<endl<<"Symbols:"<<s;
}
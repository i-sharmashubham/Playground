#include <bits/stdc++.h> 
using namespace std; 
string removeWord(string str, string word)  
{ 
    if (str.find(word) != string::npos) 
    { 
        size_t p = -1; 
        string tempWord = word + " "; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
        tempWord = " " + word; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
    } 
    return str; 
}
int main()
{
  string str;
  getline(cin,str);
  cout<<removeWord(str,"the");
}
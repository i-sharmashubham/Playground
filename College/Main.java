#include<iostream>
using namespace std;
struct College 
{ 
  char name[30]; 
  char city[20]; 
  int year; 
  float pp;
}; 
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of colleges\n";
  cin>>n;
  College c[n];
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<i+1<<"\nEnter name\n";
    cin>>c[i].name;
    cout<<"Enter city\n";
    cin>>c[i].city;
    cout<<"Enter year of establishment\n";
    cin>>c[i].year;
    cout<<"Enter pass percentage\n";
    cin>>c[i].pp;
  }
  cout<<"Details of colleges";
  for(int i=0;i<n;i++)
  {
    cout<<"\nCollege:"<<i+1<<"\nName:"<<c[i].name<<"\nCity:"<<c[i].city<<"\nYear of establishment:"<<c[i].year<<"\nPass percentage:"<<c[i].pp;
  }
}

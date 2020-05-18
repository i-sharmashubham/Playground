#include<iostream>
using namespace std;
struct Employee
{
  string name;
  int id;
  int age;
  string desg;
  int sal;
};
int main()
{
  //Type your code here.
  Employee e;
  cout<<"Enter name:\n";
  cin>>e.name;
  cout<<"Enter ID:\n";
  cin>>e.id;
  cout<<"Enter age:\n";
  cin>>e.age;
  cout<<"Enter designation:\n";
  cin>>e.desg;
  cout<<"Enter Salary:\n";
  cin>>e.sal;
  cout<<"Employee Details\nName of the Employee : "<<e.name<<"\nID of the Employee : "<<e.id<<"\nAge of the Employee : "<<e.age<<"\nDesignation of the Employee : "<<e.desg<<"\nSalary of the Employee : "<<e.sal;
}
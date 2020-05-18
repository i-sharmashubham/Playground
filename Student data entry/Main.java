#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  student data;
  cin.getline(data.name,50);
  cin>>data.roll>>data.marks;
  cout<<"\nStudent Details\nName: "<<data.name<<"\nRoll: "<<data.roll<<"\nMarks: "<<data.marks;
}
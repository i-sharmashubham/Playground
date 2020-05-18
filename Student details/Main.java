#include<iostream>
#include<string.h>
using namespace std;
int main()
{
struct Student
{
char name[30];
char department[20];
int yr;
float cgpa;
};
struct Student C1[1000];
struct Student t;
int i,j,n;
cout<<"Enter the number of students";
cin>>n;
for(i=0;i<n;i++)
{   
cout<<"\nEnter the details of student "<<i+1;
cout<<"\nEnter name";
  cin>>C1[i].name;
cout<<"\nEnter department";
  cin>>C1[i].department;
cout<<"\nEnter year of study";
  cin>>C1[i].yr;
cout<<"\nEnter cgpa";
cin>>C1[i].cgpa;
}
for(i=0;i<n;i++)
{
    for(j=i+1;j<n;j++)
    {
        if(strcmp(C1[i].name,C1[j].name)>0)
        {
            t=C1[i];
            C1[i]=C1[j];
            C1[j]=t;
        }
    }
    
}
cout<<"\nDetails of students";
for(i=0;i<n;i++)
{   

cout<<"\nStudent "<<i+1;
cout<<"\nName:"<<C1[i].name;
cout<<"\nDepartment:"<<C1[i].department;
cout<<"\nYear of study:"<<C1[i].yr;
cout<<"\nCGPA:"<<C1[i].cgpa;
}
return 0;
}
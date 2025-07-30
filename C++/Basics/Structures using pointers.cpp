#include<iostream>
using namespace std;

struct Person{
    string name;
    int age;
    int salary;
};

int main(){
    Person p1;
    Person* ptr = &p1;
    
    cout<<"Enter details like name, age and gender: "<<endl;
    cin>>ptr->name;
    cin>>ptr->age;
    cin>>ptr->salary;
    
    cout<<"Details of person are as follows: "<<endl;
    cout<<"Name: "<<ptr->name<<endl;
    cout<<"Age: "<<ptr->age<<endl;
    cout<<"Salary: "<<ptr->salary<<endl;
    
    return 0;
}
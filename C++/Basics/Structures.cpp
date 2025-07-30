#include<iostream>
using namespace std;

struct Person{
    char name[100];
    int age;
    int salary;
};

int main(){
    Person p1;
    cout<<"Person details"<<endl<<"Enter person name: ";
    cin.getline(p1.name, 100);
    cout<<"Enter person age: ";
    cin>>p1.age;
    cout<<"Enter person salary: ";
    cin>>p1.salary;
    
    cout<<endl<<"Person details are as follows:"<<endl;
    cout<<"Person name: "<<p1.name<<endl;
    cout<<"Person age: "<<p1.age<<endl;
    cout<<"Person salary: "<<p1.salary;
    return 0;
}
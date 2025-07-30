#include<iostream>
#include<string>
using namespace std;

struct Person{
    string name;
    int age;
    int salary;
};


int main(){
    Person p[2];
    cout<<"Enter details like name, age and salary: "<<endl;
    for(int i = 0; i<2; i++){
        cout<<"Enter details of person "<<(i+1)<<endl;
        cin>>p[i].name;
        cin>>p[i].age;
        cin>>p[i].salary;
    }
    
    cout<<"Detaills of users: "<<endl;
    for(int i = 0; i<2; i++){
        cout<<"Details of person "<<(i+1)<<endl;
        cout<<"Person name: "<<p[i].name<<endl;;
        cout<<"Person age: "<<p[i].age<<endl;
        cout<<"Person salary: "<<p[i].salary<<endl;
    }
    return 0;
}
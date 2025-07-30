#include<iostream>
#include<fstream>
using namespace std;

int main(){
    char arr[100];
    cout<<"Enter your name and age: "<<endl;
    cin.getline(arr,100);
    
    ofstream myfile("xyz.txt", ios::out|ios::app);
    myfile<<arr;
    myfile.close();
    cout<<"File write operaation performed successfully"<<endl<<endl;
    
    cout<<"Reading from file operation started"<<endl;
    char arr1[100];
    ifstream obj("xyz.txt");
    obj.getline(arr1,100);
    cout<<"Array content: "<<arr1<<endl;
    cout<<"File read operation completed"<<endl;
    obj.close();
    return 0;
}
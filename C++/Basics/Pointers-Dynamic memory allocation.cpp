#include<iostream>
using namespace std;

int main(){
    int size;
    int* ptr;
    cout << "Enter the number of elements of the array: ";
    cin >> size;
    ptr = new int[size];
    cout<<"Enter the elements of the array: ";
    for(int i = 0; i < size; i++){
        cin>>ptr[i];
    }
    for(int i = 0; i < size; i++){
        cout<<ptr[i]<<" ";
    }
    return 0;
}
#include<iostream>
using namespace std;

int main(){
    int first = 0, second = 1, num, next;
    cout << "Enter thre number of integers: ";
    cin >> num;
    for(int i = 0; i < num; i++){
        next = first + second;
        cout << first << " ";
        first = second;
        second = next;
    }
    return 0;
}
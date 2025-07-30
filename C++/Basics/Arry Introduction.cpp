#include<iostream>
using namespace std;

int main(){
    int a[3], b[3], add[3], sub[3], mul[3], divi[3];
    
    cout << "Enter elements of first array: " << endl;
    for(int i = 0; i < 3; i++){
        cin >> a[i];
    }
    cout << endl << "Enter the elements of second array: " << endl;
    for(int i = 0; i < 3; i++){
        cin >> b[i];
    }
    cout << endl << "Addition of two arrays: " << endl;
    for(int i = 0; i < 3; i++){
        add[i] = a[i] + b[i];
        cout << add[i] << " ";
    }
    cout << endl << "Subtraction of two arrays: " << endl;
    for(int i = 0; i < 3; i++){
        sub[i] = a[i] - b[i];
        cout << sub[i] << " ";
    }
    cout << endl << "Multiplication of arrays: " << endl;
    for(int i = 0; i < 3; i++){
        mul[i] = a[i] * b[i];
        cout << mul[i] << " ";
    }
    cout << endl << "Divisionn of two arrays: " << endl;
    for(int i = 0; i < 3; i++){
        divi[i] = a[i] / b[i];
        cout << divi[i] << " ";
    }
    return 0;
}
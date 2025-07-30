#include<iostream>
using namespace std;

int main(){
    int a[2][2], b[2][2], add[2][2], sub[2][2];
    
    cout << "Enter the elements of the first  2D array: " << endl;
    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 2; j++){
            cin >> a[i][j];
        }
        cout << endl;
    }
    
    cout << "Enter the elements of the sceond 2D array: " << endl;
    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 2; j++){
            cin >> b[i][j];
        }
        cout << endl;
    }
    
    cout << "Addition of two 2D arrays: " << endl;
    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 2; j++){
            add[i][j] = a[i][j] + b[i][j];
            cout << add[i][j] << " ";
        }
        cout << endl;
    }
    
    cout << "Subtraction of two 2D arrays: " << endl;
    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 2; j++){
            sub[i][j] = a[i][j] - b[i][j];
            cout << sub[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}
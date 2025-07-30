#include <iostream>
using namespace std;

int main(){
    int row;
    cout << "Enter the number of rows: ";
    cin >> row;
    cout << endl;
    cout << "Butterfly Pattern" << endl;
    
    // Upper Part
    for(int i = 0; i <= row; ++i){
        
        // Left Side
        for(int j = 0; j <= i; ++j){
            cout << "* ";
        }
        
        // Spaces
        int space = 2*(row-i);
        for(int j = 0; j < space; ++j){
            cout << "  ";
        }
        
        // Right Side
        for(int j = 0; j <= i; ++j){
            cout << "* ";
        }
        cout << endl;
    }
    
    // Lower Part
    for(int i = row-1; i >= 0; --i){
        
        // Left Side
        for(int j = 0; j <= i; ++j){
            cout << "* ";
        }
        
        // Spaces
        int space = 2*(row-i);
        for(int j = 0; j < space; ++j){
            cout << "  ";
        }
        
        // Right Side
        for(int j = 0; j <= i; ++j){
            cout << "* ";
        }
        cout << endl;
    }
}
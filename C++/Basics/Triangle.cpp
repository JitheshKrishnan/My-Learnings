#include <iostream>
using namespace std;

int main(){
    int a, b;
    cout << "Enter the number of rows: ";
    cin >> a;
    cout << endl;
    b = a;
    
    for(int i = 0; i < a; ++i){
        
        // Spaces
        for(int j = 0; j < b-1; ++j){
            cout << " ";
        }
        
        // Stars
        for(int j = 0; j <= i; ++j){
            cout << "* ";
        }
        cout << endl;
        --b;
    }
    return 0;
}
#include <iostream>
using namespace std;

int main(){
    int a;
    char x;
    cout << "Enter number of rows: ";
    cin >> a;
    cout << "Enter a character: ";
    cin >> x;
    for(int i = 0; i < a; ++i){
        for(int j = 0; j <= i; ++j){
            cout << "* ";
        }
        cout << endl;
    }
    cout << endl;
    for(int k = 0; k < a; ++k){
        for(int l = 1; l <= k+1; ++l){
            cout << l << " ";
        }
        cout << endl;
    }
    cout << endl;
    for(int m = 1; m <= a; ++m){
        for(int n = 1; n <= m; ++n){
            cout << m << " ";
        }
        cout << endl;
    }
    cout << endl;
    for(int o = 0; o < a; ++o){
        char q = x;
        for(int p = 0; p <= o; ++p){
            cout << q << " ";
            ++q;
        }
        cout << endl;
    }
    cout << endl;
    char t = x;
    for(int r = 0; r < a; ++r){
        for(int s = 0; s <= r; ++s){
            cout << t << " ";
        }
        ++t;
        cout << endl;
    }
    cout << endl;
    cout << "Floyd's triangle" << endl;
    int counter = 1;
    for(int u = 0; u < a; ++u){
        for(int v = 1; v <= u+1; ++v){
            cout << counter << " ";
            ++counter;
        }
        cout << endl;
    }
    return 0;
}


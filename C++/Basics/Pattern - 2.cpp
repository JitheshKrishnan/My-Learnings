#include <iostream>
using namespace std;

int main(){
    int a;
    char b;
    cout << "Enter the number of rows: ";
    cin >> a;
    cout << "Enter a character: ";
    cin >> b;
    cout << endl;
    
    for(int i = a; i > 0; --i){
        for(int j = a; j > a-i; --j){
            cout << j << " ";
        }
        cout << endl;
    }
    cout << endl;
    for(int k = a; k > 0; --k){
        for(int l = a; l > a-k; --l){
            cout << k << " ";
        }
        cout << endl;
    }
    cout << endl;
    for(int m = a; m > 0; --m){
        char o = b;
        for(int n = a; n > a-m; --n){
            cout << o << " ";
            ++o;
        }
        cout << endl;
    }
    cout << endl;
    char r = b;
    for(int p = a; p > 0; --p){
        for(int q = a; q > a-p; --q){
            cout << r << " ";
        }
        ++r;
        cout << endl;
    }
    cout << endl;
    for(int s = a; s > 0; --s){
        for(int t = a; t > a-s; --t){
            cout << "* ";
        }
        cout << endl;
    }
    return 0;
}

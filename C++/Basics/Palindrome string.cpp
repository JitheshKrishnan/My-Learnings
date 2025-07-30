#include<iostream>
using namespace std;

int main(){
    int len, l, n;
    string str;
    cout << "Enter a word: ";
    cin >> str;
    len = str.size();
    l = len;
    len = len-1;
    n = 0;
    for(int i = 0; i < l; i++){
        if(str[i] == str[len]){
            len--;
            n++;
        }
        else{
            break;
        }
    }
    if(n==l){
        cout << "Palindrome";
    }
    else{
        cout << "Not Palindrome";
    }
    return 0;
}
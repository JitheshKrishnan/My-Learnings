#include<iostream>
using namespace std;

int main(){
    char a;
    cout << "Enter a character: ";
    cin >> a;
    if(a=='a' || a=='A' || a=='e' || a=='E' || a=='i' || a=='I' || a=='o' || a=='O' || a=='u' || a=='U'){
        cout << "Vowel";
    }
    else{
        cout << "Consonant";
    }
    return 0;
}
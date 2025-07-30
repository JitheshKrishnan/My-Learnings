#include<iostream>
using namespace std;

int main(){
    int num, den, result;
    cout<<"Enter numerator and denominator: ";
    cin>>num>>den;
    try{
        if(den==0){
            throw den;
        }
        result=num/den;
        cout<<result;
    }
    catch(int ex){
        cout<<"Exception: divide by zero not allowed";
    }
    return 0;
}
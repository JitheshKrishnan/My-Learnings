#include<iostream>
using namespace std;

int maximum(int x, int y);
int main(){
    int a, b;
    cout<<"Enter two numbers: ";
    cin >> a >> b;
    cout<< "Maximun value is: "<<maximum(a,b);
    return 0;
}
int maximum(int x, int y){
    if(x>y){
        return x;
    }
    else{
        return y;
    }
}
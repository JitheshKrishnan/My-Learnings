#include<iostream>
using namespace std;

class MyBaseClass{
    public:
    int x;
    MyBaseClass(){
        x=5;
        y=6;
        z=7;
    }
    void printProtected(){
        cout<<"Y: "<<y<<endl;
    }
    protected:
    int y;
    private:
    int z;
};

class MyDerivedClass : public MyBaseClass{
    
};

void myOutsideFunction(MyBaseClass obj){
    cout<<"X: "<<obj.x<<endl;
    obj.printProtected();
}

int main(){
    MyBaseClass obj1;
    MyDerivedClass obj2;
    cout<<"X: "<<obj2.y;
    // myOutsideFunction(obj1);
    return 0;
}
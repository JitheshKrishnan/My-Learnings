#include<iostream>
using namespace std;

class ComplexNumber{
    private:
    int real;
    float imaginary;
    
    public:
    ComplexNumber(){
    }
    ComplexNumber(int r, float i){
        real = r;
        imaginary = i;
    }
    void display(){
        cout<<"Complex number is: "<<real<<" + "<<imaginary<<"i"<<endl<<endl;
    }
    int getRealPart(){
        return real;
    }
    float getImaginaryPart(){
        return imaginary;
    }
};

ComplexNumber add2number(ComplexNumber n1, ComplexNumber n2){
    int r;
    float i;
    r = n1.getRealPart()+n2.getRealPart();
    i = n1.getImaginaryPart()+n2.getImaginaryPart();
    ComplexNumber temp(r, i);
    return temp;
}

int main(){
    ComplexNumber comp1(5, 4), comp2(2, 3), comp3;
    comp1.display();
    comp2.display();
    cout<<endl<<"Addition of two complex numbers: "<<endl;
    comp3 = add2number(comp1, comp2);
    comp3.display();
    
    ComplexNumber *ptr1;
    ptr1 = &comp3;
    cout<<"Pointer to object"<<endl<<endl;
    ptr1->display();
    return 0;
}
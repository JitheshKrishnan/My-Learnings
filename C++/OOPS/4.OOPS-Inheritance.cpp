#include<iostream>
using namespace std;

class Shape{
    protected:
    int height;
    int width;
    
    public:
    void setHeight(int h){
        height = h;
    }
    void setWidth(int w){
        width = w;
    }
};

class Rectangle: public Shape{
    public:
    int area(){
        return (height*width);
    }
};

int main(){
    Rectangle rect;
    rect.setHeight(2);
    rect.setWidth(5);
    cout<<"Area of Rcetangle: "<<rect.area()<<endl;
    return 0;
}
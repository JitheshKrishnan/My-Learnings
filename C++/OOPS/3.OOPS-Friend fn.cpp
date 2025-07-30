#include<iostream>
using namespace std;

class Distance{
    private:
    int meters;
    
    public:
    Distance(){
        meters = 0;
    }
    void display(){
        cout<<"Meters is: "<<meters;
    }
    friend void addValue(Distance &d);
};

void addValue(Distance &d){
    d.meters = d.meters + 5;
}

int main(){
    Distance d1;
    addValue(d1);
    d1.display();
    return 0;
}
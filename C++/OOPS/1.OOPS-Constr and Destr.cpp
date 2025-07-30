#include<iostream>
#include<string>
using namespace std;

class Cars {
    private:
    string company_name;
    string model_name;
    string fuel_type;
    float milage;
    double price;
    
    public:
    //Default constructor
    Cars(){
        cout<<"Default constructor called"<<endl;
    }
    //Parameterized constructor
    Cars(string cname, string mname, string ftype, float m, double p){
        company_name = cname;
        model_name = mname;
        fuel_type = ftype;
        milage = m;
        price = p;
        cout<<"Parameterized constructor called"<<endl;
    }
    //Copy constructor
    Cars(Cars &obj){
        company_name = obj.company_name;
        model_name = obj.model_name;
        fuel_type = obj.fuel_type;
        milage = obj.milage;
        price = obj.price;
        cout<<"Copy constructor called"<<endl;
    }
    
    void setData(string cname, string mname, string ftype, float m, double p){
        company_name = cname;
        model_name = mname;
        fuel_type = ftype;
        milage = m;
        price = p;
    }
    void displayData(){
        cout<<"Car Properties:"<<endl<<endl;
        cout<<"Car Company Name: "<<company_name<<endl;
        cout<<"Car Model Name: "<<model_name<<endl;
        cout<<"Car Fuel Type: "<<fuel_type<<endl;
        cout<<"Car Milage: "<<milage<<endl;
        cout<<"Car Price: "<<price<<endl;
    }
    //Destructor
    ~Cars(){
        cout<<endl<<"Destructor called"<<endl;
    }
};

int main(){
    Cars car1, car2("Toyota", "fortuner", "diesel", 10, 3500000);
    car1.setData("toyota", "innova", "diesel", 15.5, 1500000);
    car1.displayData();
    car2.displayData();
    Cars car3 = car1;
    car3.displayData();
    return 0;
}
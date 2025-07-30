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
    void setData(string cname, string mname, string ftype, float m, double p){
        company_name = cname;
        model_name = mname;
        fuel_type = ftype;
        milage = m;
        price = p;
    }
    void dispalyData(){
        cout<<"Car Properties:"<<endl<<endl;
        cout<<"Car Company Name: "<<company_name<<endl;
        cout<<"Car Model Name: "<<model_name<<endl;
        cout<<"Car Fuel Type: "<<fuel_type<<endl;
        cout<<"Car Milage: "<<milage<<endl;
        cout<<"Car Price: "<<price<<endl;
    }
};

int main(){
    Cars car1;
    car1.setData("toyota", "innova", "diesel", 15.5, 1500000);
    car1.dispalyData();
    return 0;
}
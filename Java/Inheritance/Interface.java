package Inheritance;

interface A{
    int age = 44;     // Variables inside interface are static final by default
    String area = "Bangalore";
    
    void show(); // Methods inside interface are public static by default
    void config();
}

interface X{
    void run();
}

interface Y extends X{

}

class B implements A,Y{
    public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In config");
    }
    public void run(){
        System.out.println("In run");
    }
}
public class Interface {
    public static void main(String a[]){
        A obj = new B();
        obj.show();
        obj.config();
        X obj1 = new B();
        obj1.run();

        System.out.println(A.age);
        System.out.println(A.area);
    }
}

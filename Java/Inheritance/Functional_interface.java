package Inheritance;

@FunctionalInterface
interface A{
    void show();
}

class B implements A{
    public void show(){
        System.out.println("in show");
    }
}

public class Functional_interface {
    public static void main(String a[]){
        A obj = new A()
        {
            public void show(){
                System.out.println("In Anonymous inner class show...");
            }
        };
        obj.show();
        A obj1 = new B();
        obj1.show();
    }
}

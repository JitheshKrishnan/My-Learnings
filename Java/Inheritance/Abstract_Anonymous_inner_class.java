package Inheritance;

abstract class A{
    public abstract void show();
    public abstract void config();
} 
public class Abstract_Anonymous_inner_class {
    public static void main(String a[]){
        A obj = new A()
        {
            public void show(){
                System.out.println("In new show...");
            }
            public void config(){
                System.out.println("In new config...");
            }
        };
        obj.show();
        obj.config();
    }
}

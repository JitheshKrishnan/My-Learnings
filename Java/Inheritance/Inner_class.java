package Inheritance;

class A{
    int age;

    public void show(){
        System.out.println("In show...");
    }

    static class B{
        public void config(){
            System.out.println("In config...");
        }
    }
}
public class Inner_class {
    public static void main(String a[]){
        A obj = new A();
        obj.show();
        A.B obj1 = new A.B(); //for static inner class, also the outermost class can never be static
        obj1.config();
        // A.B obj1 = obj.new B(); // For non-static inner class
    }
}

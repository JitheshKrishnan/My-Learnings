package Inheritance;

class A{
    public void show1(){
        System.out.println("in A");
    }
}

class B extends A{
    public void show2(){
        System.out.println("in B");
    }
}
public class Upcasting_and_downcasting {
    public static void main(String a[]){
        A obj = new B();
        obj.show1();

        B obj1 = (B) obj;
        obj1.show2();
        obj1.show1();

    }
}

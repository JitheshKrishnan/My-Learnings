package Inheritance;

class A {
    public void show(){
        System.out.println("In A show");
    }
}
public class Anonymous_inner_class {
    public static void main(String a[]){
        A obj = new A()
        {
            public void show(){
                System.out.println("In new show");
            }
        };
        obj.show();
    }
}

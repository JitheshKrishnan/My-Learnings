package Inheritance;

class A{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int n){
        this();
        System.out.println("In A int");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
    public B(int n){
        super(n);
        System.out.println("In B int");
    }
    public B(int n, int m){
        this();
        System.out.println("In B int int");
    }
}

public class This_and_super {
    public static void main(String a[]){
        B obj = new B(5);
        
    }
}

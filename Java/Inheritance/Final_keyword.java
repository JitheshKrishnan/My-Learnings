package Inheritance;

class A{
    public final void show(){
        System.out.println("By JK");
    }
    public void add(int n1, int n2){
        System.out.println(n1+n2);
    }
}

class B extends A {
    public void show1(){
        System.out.println("By NK");
    }

}
public class Final_keyword {
    public static void main(String a[]){
        final int x = 10;
        B obj = new B();
        obj.show();
        obj.show1();
        obj.add(x,7);
    }
}

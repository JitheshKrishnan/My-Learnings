package Inheritance;

@FunctionalInterface
interface A{
    void show(int i);
}

@FunctionalInterface
interface B{
    int add(int i, int j);    // Lambda with return 
}

public class Lambda_expression {
    public static void main(String a[]){
        
        // A obj = () -> System.out.println("In Lambda expression show..."); // for no passed value
        A obj = (i) -> System.out.println("In Lambda expression show..."+i);
        // A obj = i -> System.out.println("In Lambda expression show..."); // with passed value can also be put without braces
        obj.show(5);

        B obj1 = (i,j) -> i+j;  // Lambda expression
        
        System.out.println(obj1.add(4,5));
    }
}

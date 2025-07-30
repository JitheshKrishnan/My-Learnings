class Calculator{
    int num = 5; 

    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }
}

public class Stack_and_heap_memory {
    public static void main(String s[]){
        int a = 2;
        int b = 3;

        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        int result = obj.add(a, b);
        obj.num = 10;
        System.out.println(result);
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }    
}

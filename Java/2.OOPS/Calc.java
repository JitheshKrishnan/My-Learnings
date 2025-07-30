class Calculator{
    int s; 

    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }
    public int add(int n1, int n2, int n3){ // Method Overloading (same method name but different parameters)
        int r = n1 + n2 + n3;
        return r;
    }
    public double add(double n1, int n2){ // Method Overloading (same method name but different parameters)
        double r = n1 + n2;
        return r;
    }
}

public class Calc {
    public static void main(String s[]){
        int a = 2;
        int b = 3;

        Calculator calc = new Calculator();
        int result = calc.add(a, b);
        System.out.println(result);
    }    
}

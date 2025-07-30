package Inheritance;

class Laptop{
    int price;
    String name;

    public boolean equals(Laptop that){
        return this.name.equals(that.name) && this.price == that.price;
    }
}
public class ToString {
    public static void main(String a[]){
        Laptop obj1 = new Laptop();
        obj1.name = "Lenovo Yoga";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.name = "Lenovo Yoga";
        obj2.price = 1000;

        System.out.println(obj1.toString());

        boolean result = obj1.equals(obj2);
        System.out.println(result);
    }    
}

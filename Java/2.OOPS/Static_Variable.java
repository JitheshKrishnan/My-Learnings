class Mobile{
    String brand;
    int cost;
    static String name;

    public void show(){
        System.out.println(brand + " : " + cost + " : " + name);
    }
}

public class Static_Variable {
    public static void main(String a[]) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.cost = 1500;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.cost = 1700;

        obj1.show();
        obj2.show();
    }   
}

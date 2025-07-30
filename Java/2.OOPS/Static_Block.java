class Mobile{
    String brand;
    int cost;
    static String name;

    public Mobile(){ // Constructor
        brand = "Apple";
        cost = 200;
        System.out.println(" in Constructor"); 
    }

    static{ // Static Block
        name = "Phone";
        System.out.println(" in Static Block");
    }

    public void show(){
        System.out.println(brand + " : " + cost + " : " + name);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand+" : "+obj.cost+" : "+name);
    }
}

public class Static_Block {
    public static void main(String a[]) {
        
        //Class.forName(className: "Mobile");
        
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.cost = 1500;
        Mobile.name = "SmartPhone";

        Mobile.name = "Phones";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.cost = 1700;

        obj1.show();
        obj2.show();
        Mobile.show1(obj1);
    }   
}

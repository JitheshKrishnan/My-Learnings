package Inheritance;

enum Status{                            // Normal Enum
    Running, Failed, Pending, Success;
}

enum Laptop{                            // Enum with customized instance variables, constructors and methods
    MacBook(2000), XPS(2200), Surface, Thinkpad(1800);

    
    private Laptop() {
        price = 500;
    }

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Enum {
    public static void main(String a[]){
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] ss = Status.values();

        for(Status i : ss){
            System.out.println(i + " : " + i.ordinal());
        }

        // Enum with if and switch

        if(s==Status.Running){
            System.out.println("All good");
        }
        else if(s==Status.Failed){
            System.out.println("Try again");
        }
        else if(s==Status.Pending){
            System.out.println("Please wait");
        }
        else{
            System.out.println("Done");
        }

        switch (s) {
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
                break;
        }

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}

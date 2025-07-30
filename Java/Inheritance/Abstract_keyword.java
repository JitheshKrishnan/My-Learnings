package Inheritance;

abstract class Car{                 // Abstract Class
    public abstract void drive();   // Abstract Method
    public abstract void fly();

    public void start(){
        System.out.println("Start...");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Drive...");
    }
}

class UpdateWagonR extends WagonR{   // Concrete Class
    public void fly() {
        System.out.println("Fly...");
    }
    
}
public class Abstract_keyword {
    public static void main(String a[]){
        UpdateWagonR veh = new UpdateWagonR();
        veh.fly();
        veh.drive();
        veh.start();
    }
}

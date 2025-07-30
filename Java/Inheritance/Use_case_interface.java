package Inheritance;

interface Computer{ // Computer is a concept but not a physical entity, a more of a general term, just like we mention flowers instead of lily, jasmine, etc.,.
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Code, Compile, Run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code, Compile, Run : Faster");
    }
}

public class Use_case_interface {
    public static void main(String a[]){
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        lap.code();
        desk.code();
    }    
}

package Exception_Handling;

class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Exception_Handling.Throws_keyword");   // Checked Exception
        System.out.println("No Exception");
    }
}
public class Throws_keyword{

    static {
        System.out.println("Class Loaded");
    }
    public static void main(String a[]){
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Exception called");
        }
    }
}
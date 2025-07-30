package Exception_Handling;

public class Throw_keyword {
    public static void main(String a[]){
        int i = 2;
        int j = 0;

        try{
            j = 18/i;
            if(j==0){
                throw new ArithmeticException("Sorry, I don't want output as zero");
            }
        }
        catch(ArithmeticException e){
            j = 18/1;
            System.out.println("That's the default output");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("Buh Bye");
    }
}

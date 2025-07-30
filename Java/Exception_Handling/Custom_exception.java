package Exception_Handling;

class JithuException extends Exception{
    public JithuException(String str){
        super(str);
    }
}
public class Custom_exception {
    public static void main(String a[]){
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0){
                throw new JithuException("Sorry, I don't want output as zero");
            }
        }
        catch(JithuException e){
            j = 18/1;
            System.out.println("That's the default output" + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("Buh Bye");
    }
}
package Exception_Handling;

public class Try_catch {
    public static void main(String a[]){
        int i = 9;
        int j = 0;
        int nums[] = new int[5];
        String str = null;

        try{
            j = 18/i;
            System.out.println(nums[1]);
            System.out.println(nums[4]);
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay within your limit");
        }
        catch(Exception e){
            System.out.println("Something went wrong..." + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}

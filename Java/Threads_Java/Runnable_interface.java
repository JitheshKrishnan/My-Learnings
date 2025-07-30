package Threads_Java;

public class Runnable_interface {
    public static void main(String a[]){
        Runnable obj1 = () ->
        {
            for(int i = 0; i < 5; i++){
                try{
                    System.out.println("Hi");
                    Thread.sleep(10);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () -> {
            for(int i = 0; i < 5; i++){
                try{
                    System.out.println("Hello");
                    Thread.sleep(10);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t2.start();
    }
}
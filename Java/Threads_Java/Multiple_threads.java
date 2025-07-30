package Threads_Java;

class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try { Thread.sleep(10);} 
            catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try { Thread.sleep(10);} 
            catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

public class Multiple_threads {
    public static void main(String a[]){
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);
        // Thread priority ranges from 1-10;

        obj1.start();
        try { Thread.sleep(20);} 
        catch (InterruptedException e) {e.printStackTrace();}
        obj2.start();
    }
}

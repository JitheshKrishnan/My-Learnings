package Threads_Java;

class Counter{
    int c;
    public synchronized void increment(){
        c++;
    }
}
public class Synchronized_keyword {
    public static void main(String a[]) throws InterruptedException{

        Counter cn = new Counter();
        
        Runnable obj1 = () ->
        {
            for(int i = 0; i < 100000; i++){
                cn.increment();
            }
        };
        Runnable obj2 = () -> {
            for(int i = 0; i < 100000; i++){
                cn.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(cn.c);
    }
}
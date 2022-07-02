package Erkan;

public class MyThread implements Runnable{

    @Override
    public void run() {
       while(true){
           System.out.println(Thread.currentThread().getName() + " is running!");
       }
    }
}

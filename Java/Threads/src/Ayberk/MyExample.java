package Ayberk;

public class MyExample implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running!");
    }
}

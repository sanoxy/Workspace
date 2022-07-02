package Ayberk;

public class MyExampleThreadVersion extends Thread {

    MyExampleThreadVersion(String name){
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " = " + i);
        }
    }
}

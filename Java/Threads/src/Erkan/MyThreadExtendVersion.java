package Erkan;

public class MyThreadExtendVersion extends Thread{
    public MyThreadExtendVersion(String s) {
        super(s);
    }

    public void run(){
        for (int i=0;i<3; i++){
            System.out.println(Thread.currentThread().getName() + " = " + i);
        }
    }

}

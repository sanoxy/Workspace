package Erkan;

import Ayberk.MyExampleThreadVersion;

public class Main {
    public static void main(String[] args) {
//        for(int i = 0; i<5; i++){
//            Thread object = new Thread(new MyThread(), String.valueOf(i));
//            object.start();
//        }


        for(int i = 0; i<5; i++){
            MyThreadExtendVersion object = new MyThreadExtendVersion("T-"+i);
            object.start();
        }
    }
}

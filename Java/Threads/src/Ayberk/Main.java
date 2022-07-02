package Ayberk;

public class Main {
//    public static void main(String[] args) {
//        for(int i = 0; i<5; i++){
//            Thread thread = new Thread(new MyExample(), String.valueOf(i));
//            thread.start();
//        }
//    }

    public static void main(String[] args) {
        for(int i = 0; i<3; i++){
            MyExampleThreadVersion threadVersion = new MyExampleThreadVersion("T"+i);
            threadVersion.start();
        }
    }
}

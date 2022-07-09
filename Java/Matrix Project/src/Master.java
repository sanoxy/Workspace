import java.util.ArrayList;
import java.util.Date;

public class Master {
    public static void main(String[] args) throws InterruptedException {
        int[][] matrix = new int[1000][1000];

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                matrix[i][j] = 0;
            }
        }

//        Date start = new Date();
//        for (int[] ints : matrix) {
//            for (int anInt : ints) {
//                System.out.println(Thread.currentThread().getName() + " ==> " + anInt);
//            }
//        }
//
//        System.out.println("Time passed => " + (new Date().getTime()-start.getTime()));

        ArrayList<Thread> threadArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new MyThread(getMatrix(i,matrix), ("T"+i)));
            threadArrayList.add(thread);
        }

        Date start = new Date();
        for(Thread thread : threadArrayList){
            thread.start();
        }

        for(Thread thread : threadArrayList){
            thread.join();
        }

        Date end = new Date();

        System.out.println(end.getTime()-start.getTime());

    }

    public static int[][] getMatrix(int index, int[][] matrix) {
        int start = index * 100;
        int end = start + 99;

        int[][] ans = new int[100][1000];
        int offset = 0;

        for(int i = start; i<end; i++, offset++){
            ans[offset] = matrix[i];
        }

        return ans;
    }
}
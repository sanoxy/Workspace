public class MyThread implements Runnable {
    int[][] matrix;
    String name;

    public MyThread(int[][] matrix, String name) {
        this.name = name;
        this.matrix = matrix;
    }

    @Override
    public void run() {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.println(name + " ==> " + anInt);
            }
        }
    }
}

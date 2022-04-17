import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
//        int sum = 0;
//        double avg;
//
////        for(int num: numbers){
////            sum += num; // sum = sum + num;
////        }
//
//        for(int i=0; i< numbers.length; i++){
//            sum += numbers[i];
//        }
//
//        int arrayLength = numbers.length;
//
//        avg = (double)sum/(double)arrayLength;
//
//        System.out.println("Sum = " + sum);
//        System.out.println("Avg = " + avg);

//        int[][] a = {
//                {1,2,3},
//                {4,5,6,7},
//                {7,8}};
//
//        System.out.println("Length of row 1: " + a[0].length); //3
//        System.out.println("Length of row 2: " + a[1].length); //4
//        System.out.println("Length of row 3: " + a[2].length); //2

//        int[][] a = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        int i, j;
////        for(i=0; i< a.length; i++){
////            for(j=0; j<a[i].length; j++){
////                System.out.print(a[i][j] + "  ");
////            }
////            System.out.println();
////        }
//
//        for (int[] arr : a) {
//            for (int num : arr) {
//                System.out.print(num + "  ");
//            }
//            System.out.println();
//        }

//        int[][] mat = new int[3][3];
//        Scanner inputTaker = new Scanner(System.in);
//
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                mat[i][j] = inputTaker.nextInt();
//            }
//        }
//
//        for (int[] arr : mat) {
//            for (int num : arr) {
//                System.out.print(num + "  ");
//            }
//            System.out.println();
//        }

//        int[][] mat = new int[3][3];
//        Scanner inputTaker = new Scanner(System.in);
//
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                mat[i][j] = inputTaker.nextInt();
//            }
//        }
//
//        for (int[] arr : mat) {
//            int sum = 0;
//            for (int num : arr) {
//                sum += num;
//                System.out.print(num + "  ");
//            }
//            System.out.println("\tAVG = " + (double)sum/arr.length);
//        }

//        int[][] mat = new int[3][3];
//        Scanner inputTaker = new Scanner(System.in);
//
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                mat[i][j] = inputTaker.nextInt();
//            }
//        }
//
//        for (int[] arr : mat) {
//            for (int num : arr) {
//                if (num % 2 == 0) {
//                    System.out.print(num + "  ");
//                }
//                else{
//                    System.out.print(" " + "  ");
//                }
//            }
//            System.out.println();
//        }

//        int[] arr = new int[10];
//
//        Scanner inputTaker = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = inputTaker.nextInt();
//        }
//
//        int max = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        System.out.println("Max = " + max);

        //SORTING

//        int[] array1 = new int[50000];
//        generateRandomArray(array1);
//        //printArray(array1);
//        Date start = new Date();
//        bubbleSort(array1, array1.length);
//        Date end = new Date();
//        //printArray(array1);
//        System.out.println("Bubble Sort: " + (end.getTime()-start.getTime()) +"ms");
//
//        int[] array2 = new int[50000];
//        generateRandomArray(array2);
//        //printArray(array2);
//        Date start1 = new Date();
//        selectionSort(array2);
//        Date end1 = new Date();
//        //printArray(array2);
//        System.out.println("Selection Sort: " + (end1.getTime()-start1.getTime()) +"ms");
//
//        int[] array3 = new int[50000];
//        generateRandomArray(array3);
//        //printArray(array3);
//        Date start2 = new Date();
//        insertionSort(array3);
//        Date end2 = new Date();
//        //printArray(array3);
//        System.out.println("Insertion Sort: " + (end2.getTime()-start2.getTime()) +"ms");
    }

//    public static void insertionSort(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int key = arr[i];
//            int j = i - 1;
//
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }
//            arr[j + 1] = key;
//        }
//    }
//
//    public static void generateRandomArray(int[] arr) {
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(0, 1000);
//        }
//    }
//
//    static void selectionSort(int arr[]) {
//        for (int step = 0; step < arr.length - 1; step++) {
//            int min_idx = step;
//
//            for (int i = step + 1; i < arr.length; i++) {
//                if (arr[i] < arr[min_idx]) {
//                    min_idx = i;
//                }
//            }
//
//            int temp = arr[step];
//            arr[step] = arr[min_idx];
//            arr[min_idx] = temp;
//        }
//    }
//
//    static void bubbleSort(int arr[], int arrSize) {
//        int i, j, temp;
//        boolean swapped;
//
//        for (i = 0; i < arrSize - 1; i++) {
//            swapped = false;
//            for (j = 0; j < arrSize - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//
//            if (!swapped) {
//                break;
//            }
//        }
//    }
//
//    static void printArray(int arr[]) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ", ");
//        }
//        System.out.println();
//    }
}

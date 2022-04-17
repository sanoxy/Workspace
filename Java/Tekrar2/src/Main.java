import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    static int addNumbers(int n1, int n2) {
//        return n1 + n2;
//    }
//    static int square(int num) {
//        return num * num;
//    }

//    static int power(int base, int exponent){
//        int result = 1;
//        for (int i=1; i<=exponent; i++){
//            result *= base;
//        }
//        return result;
//    }

//    static int sum(int n) {
//        if (n == 0)
//            return n;
//        return n + sum(n-1);
//    }

//    static int power(int base, int exp){
//        if (exp == 0)
//            return 1;
//        return base * power(base,exp-1);
//    }

//    static int fact(int n){
//        if (n == 0)
//            return 1;
//        return n * fact(n-1);
//    }

//    static int square(int n){
//        return n * n;
//    }
//    static int GCD(int n1, int n2) {
//        if (n2 != 0)
//            return GCD(n2, n1 % n2);
//        return n1;
//    }

    public static void main(String[] args) {

//        System.out.println("GCD of 20 and 15 is " + GCD(20, 15));

//        System.out.println("Factorial of 5 is = " + fact(5) );

//        System.out.println("sum(10) = " + sum(10));
//        System.out.println("Power is = " + power(3,4));

//        System.out.println("Square of 5 is " + square(5));
//        System.out.println("Total numbers = " + addNumbers(5,6));
//        int i = 1;
//
//        while(i<5){
//            System.out.println(i);
//            i++;
//        }

//        Scanner inputTaker = new Scanner(System.in);
//        int sum = 0;
//        int num = 0;
//
//        while(num>=0){
//            sum += num;
//            System.out.print("Enter a number = ");
//            num = inputTaker.nextInt();
//        }
//        System.out.println("Toplam = " + sum);

//        Scanner inputTaker = new Scanner(System.in);
//        StringBuilder finalString = new StringBuilder();
//        String name;
//
//        while(!(name = inputTaker.nextLine()).equals("")) {
//            finalString.append(name).append(" ");
//            System.out.println(finalString);
//        }

//        do {
//            //Code
//        } while(condition);

//        int i=1;
//        do{
//            System.out.println(i);
//            i++;
//        } while (i<5);

//        Scanner inputTaker = new Scanner(System.in);
//        int sum = 0;
//        int num = 0;
//        do {
//            sum += num;
//            System.out.print("Enter a number = ");
//            num = inputTaker.nextInt();
//        } while (num >= 0);
//
//        System.out.println("Sum = " + sum);

        /*
                0x0 = 0
                0x1 = 0
                0z2 = 0;
                0x3 = 0
                0x4 = 0;
                ...
                10x10 = 100
         */

//        for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j <= 10; j++){
//                System.out.println(i + " X " + j + " = " + (i*j));
//            }
//            System.out.println();
//        }

//        Scanner inputTaker = new Scanner(System.in);
//        System.out.print("Enter first number = ");
//        int number1 = inputTaker.nextInt();
//        System.out.print("Enter second number = ");
//        int number2 = inputTaker.nextInt();
//
//        int max = Math.max(number1, number2);
//
//        while (true) {
//            if (max % number1 == 0 && max % number2 == 0) {
//                System.out.println("LCM is " + max);
//                break;
//            }
//            ++max;
//        }

//        Scanner inputTaker = new Scanner(System.in);
//        System.out.print("Enter first number = ");
//        int number1 = inputTaker.nextInt();
//        System.out.print("Enter second number = ");
//        int number2 = inputTaker.nextInt();
//
//        for (int min = Math.min(number1, number2); min >= 1; min--) {
//            if(number1%min==0 && number2%min==0){
//                System.out.println("GCD is = " + min);
//                break;
//            }
//        }

//        int x = 5;
//
//        String[] array = new String[100];
//
//        int[] ages = new int[5];
//        ages[0] = 10;
//        ages[1] = 20;
//        ages[2] = 30;

//        int[] ages = new int[10];

//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);

//        for (int i = 0; i < ages.length; i++) {
//            System.out.println(ages[i]);
//        }

//        for (int number : ages) {
//            System.out.println(number);
//        }

//        Scanner inputTaker = new Scanner(System.in);
//        for (int i = 0; i < ages.length; i++) {
//            ages[i] = inputTaker.nextInt();
//        }

//        System.out.println("Array is = " + Arrays.toString(ages));

//        for (int x:ages){
//            System.out.print(x +" ");
//        }

//        Scanner inputTaker = new Scanner(System.in);
//        int[] array = new int[10];
//        int sum = 0;
//        for (int i=0; i<array.length;i++ ){
//            array[i]=inputTaker.nextInt();
//            sum += array[i];
//        }
//
//        System.out.println("Total is = " + sum);


    }
}

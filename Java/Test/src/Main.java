import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
                            Arithmetic operators

                                +
                                -
                                *
                                /
                                %

                             Assignment Operators

                                =
                                +=
                                -=
                                *=
                                /=
                                %=

                             Relational Operators

                                ==
                                !=
                                >
                                <
                                >=
                                <=

                            Logical Operators

                                &&
                                ||
                                !

                             Unary

                                +
                                -
                                ++
                                --
                                !

                             Bitwise Operators

                                ~
                                >>
                                <<
                                >>>
                                &
                                ^
         */

//        System.out.print("Erkan");
//        System.out.println("Erkan");

//        String name = "Erkan";
//        int age = 51;
//        double salary = 5000;
//
//        System.out.println("Name: " + name + "\nAge: " + age + "\nSalary: " + salary);

//        String name= "Ayberk";
//        int age= 22;
//        double salary= 10000;
//
//        System.out.println("Name: " + name + "\nAge: " + age + "\nSalary: " + salary);

//        Scanner inputTaker = new Scanner(System.in);
//
//        int num = inputTaker.nextInt();
//
//        System.out.println("Your num: " + num);

//        String name = inputTaker.nextLine();
//
//        int age = inputTaker.nextInt();
//        double gpa = inputTaker.nextDouble();
//        float salary = inputTaker.nextFloat();
//
//        System.out.println("Name: " + name + "\nAge: " + age + "\nGPA: " + gpa + "\nSalary : " + salary);

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = input.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = input.nextInt();
//
//        System.out.print("Enter your GPA: ");
//        double gpa = input.nextDouble();
//
//        System.out.print("Enter your salary: ");
//        double salary = input.nextDouble();
//
//        System.out.println("Your name: " + name + "\nYour age: " + age + "\nYour GPA: " + gpa + "\nYour salary: " + salary);

        /*
                                        FLOW CONTROL

                   if(condition1){

                   }
                   else if(condition2){

                   }
                   else if(){

                   }
                   else{

                   }


                    switch(expression){
                        case "Ayberk":
                            //code
                        case "Erkan":
                            //code
                            .
                            .
                            .
                            .
                        default:
                            //code
                    }
         */

//        Scanner input = new Scanner(System.in);
//        int n1 = input.nextInt();
//        int n2 = input.nextInt();
//        int n3 = input.nextInt();
//
//        if (n1 > n2 && n1 > n3) {
//            System.out.println("n1 is the biggest number");
//            if (n2 > n3) {
//                System.out.println("n2 is the middle number");
//                System.out.println("n3 is the smallest number");
//            } else {
//                System.out.println("n3 is the middle number");
//                System.out.println("n2 is the smallest number");
//            }
//        } else if (n2 > n1 && n2 > n3) {
//            System.out.println("n2 is the biggest number");
//            if (n1 > n3) {
//                System.out.println("n1 is the middle number");
//                System.out.println("n3 is the smallest number");
//            } else {
//                System.out.println("n3 is the middle number");
//                System.out.println("n1 is the smallest number");
//            }
//        } else {
//            System.out.println("n3 is the biggest number");
//            if (n1 > n2) {
//                System.out.println("n1 is the middle number");
//                System.out.println("n2 is the smallest number");
//            } else {
//                System.out.println("n2 is the middle number");
//                System.out.println("n1 is the smallest number");
//            }
//        }

//        int num = 447;
//
//        switch (num) {
//            case 29 -> System.out.println("Small");
//            case 42 -> System.out.println("Med");
//            case 44 -> System.out.println("Large");
//            case 48 -> System.out.println("Xlarge");
//            default -> System.out.println("Error!");
//        }

//        for(int i = 0; i<10; i++){
//            System.out.println(i);
//        }
//        Scanner scanner = new Scanner(System.in);
//        int num;
//        int sum = 0;
//        System.out.print("Enter Number: ");
//        num = scanner.nextInt();
//
//        while(num > 0){
//            sum += num;
//            num--;
//        }
//        System.out.println(sum);

//        int[] numbers = {1,2,3,4,5};
//
//        for(int num: numbers){
//            System.out.println(num);
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        int ans = 1;
//        for (int i=1; i<=number; i++){
//            ans = ans * i; //ans *= i;
//        }
//        System.out.println(ans);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = scanner.nextInt();
//        int reminder;
//        int reverse = 0;
//
//        //12345
//        while (number != 0) {
//            reminder = number % 10;
//            reverse = reverse * 10 + reminder;
//            number /= 10;
//        }
//
//        System.out.println(reverse);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = scanner.nextInt();
//
//        boolean isPrime = true;
//        if (number<2)
//            isPrime = false;
//
//        Date start = new Date();
//        for (int i = 2; i <= number/2; i++) {
//            if (number % i == 0) {
//                isPrime = false;
//            }
//        }
//        Date end = new Date();
//
//        if (isPrime) {
//            System.out.println("Number is prime!");
//        } else {
//            System.out.println("Number is not prime!");
//        }
//
//        System.out.println("Runtime: " + (end.getTime()-start.getTime()));
//        Scanner scanner = new Scanner(System.in);
//        int min = scanner.nextInt();
//        int max = scanner.nextInt();
//
//        for(int number = min; number<=max; number++){
//            boolean isPrime = true;
//            if (number<2)
//                isPrime = false;
//
//            Date start = new Date();
//            for (int i = 2; i <= number/2; i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                }
//            }
//            Date end = new Date();
//
//            if (isPrime) {
//                System.out.println("Number " + number + " is prime!");
//            } else {
//                System.out.println("Number " + number + " is not prime!");
//            }
//
//            System.out.println("Runtime: " + (end.getTime()-start.getTime()));
//        }

        //String[] arr = new String[100];
//        double[] data;
//
//        int[] age = {1, 2, 3, 4, 5};
//        System.out.println(age[0]);
//
//        for (int num : age) {
//            System.out.println(num);
//        }

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "NULL";
//        }
//
//        for (String iterator : arr) {
//            System.out.println(iterator);
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        int total = 0;
//        for (int num : arr) {
//            total += num;
//        }
//        System.out.println("Avg: " + (double)total/10);

//        int[][] matrix = new int[3][3];
//
//        for (int[] ints : matrix) {
//            Arrays.fill(ints, 1);
//        }
//
//        int sum = 0;
//
//        for(int[] ints : matrix){
//            for(int num : ints){
//                sum += num;
//            }
//        }
//
//        System.out.println(sum);

//        Scanner scanner = new Scanner(System.in);
//        int[][] matrix = new int[2][2];
//
//        int total = 0;
//
//        for (int i=0; i<2; i++){
//            for (int j=0; j<2; j++){
//                matrix[i][j]= scanner.nextInt();
//                total += matrix[i][j];
//            }
//        }
//        System.out.println("Avg: " + (double)total/(matrix.length * matrix[0].length));



















    }
}

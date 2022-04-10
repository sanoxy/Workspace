import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String firstname = "Erkan";
//        String lastname = "Ozcan";
//        int age = 51;
//        float average = 3.7f;
//        double pi = 3.14;
//        char third = 'k';
//        char fourth = firstname.charAt(3);
//        boolean sex = true;
//
//        System.out.println(firstname + " " + lastname + " " + age);

//        int a = 12, b = 5;
//
//        // addition operator
//        System.out.println("a + b = " + (a + b)); //17
//
//        // subtraction operator
//        System.out.println("a - b = " + (a - b)); //7
//
//        // multiplication operator
//        System.out.println("a * b = " + (a * b)); //60
//
//        // division operator
//        System.out.println("a / b = " + ((float)a / b)); //2.4
//
//        // modulo operator
//        System.out.println("a % b = " + (a % b)); //2

//        int a = 4;
//        int var;
//
//        // assign value using =
//        var = a;
//        System.out.println("var using =: " + var); //4
//
//        // assign value using =+
//        var += a;
//        System.out.println("var using +=: " + var); //8
//
//        // assign value using =*
//        var *= a;
//        System.out.println("var using *=: " + var); //32

//        // create variables
//        int a = 7, b = 11;
//
//        // value of a and b
//        System.out.println("a is " + a + " and b is " + b);
//
//        // == operator
//        System.out.println(a == b); // False
//
//        // != operator
//        System.out.println(a != b); //True
//
//        // > operator
//        System.out.println(a > b); //False
//
//        // < operator
//        System.out.println(a < b); //True
//
//        // <= operator
//        System.out.println(a <= b); //True
//
//        // >= operator
//        System.out.println(a >= b); //False

//        // && operator
//        System.out.println((5 > 3) && (8 > 5)); //True
//        System.out.println((5 > 3) && (8 < 5)); //False
//
//        // || operator
//        System.out.println((5 < 3) || (8 > 5)); //True
//        System.out.println((5 > 3) || (8 < 5)); //True
//        System.out.println((5 < 3) || (8 < 5)); //False
//
//        // ! operator
//        System.out.println(!(5 == 3)); //True
//        System.out.println(!(5 > 3)); //False

        /*

                    ++
                    a = 10;
                    a++;
                    ( a => 11)

                    --
                    b = 10
                    b--;
                    (b => 9)
         */

        //instanceOf

//        String name = "Erkan";
//        System.out.println(name instanceof String);
//
//        System.out.println("1. println");
//        System.out.println("2. println");
//
//        System.out.print("1. print");
//        System.out.print("2. print");
//        String firstn = "Erkan";
//        String lastn = "Ozcan";
//        System.out.print("Name = " + firstn + "\nSurname = " + lastn);

//        //SınıfAdı objeAdı = new Cons(..);
//        Scanner inputTaker = new Scanner(System.in);
////
////        System.out.print("Enter an integer: ");
////        int number = inputTaker.nextInt();
////        System.out.println("You entered: " + number);
//
//        String name = inputTaker.nextLine();
//        System.out.println("Your name = " + name);

//        Scanner inputTaker = new Scanner(System.in);
//
//        String name, surname;
//        int age;
//        double average;
//
//        System.out.print("Enter your name = ");
//        name = inputTaker.nextLine();
//
//        System.out.print("Enter your surname = ");
//        surname = inputTaker.nextLine();
//
//        System.out.print("Enter your age = ");
//        age = inputTaker.nextInt();
//
//        System.out.print("Enter your average = ");
//        average = inputTaker.nextDouble();
//
//        System.out.println(
//                "\nYour name = " + name
//                + "\nYour surname = " + surname
//                + "\nYour age = " + age
//                + "\nYour average = " + average);

        /*

            if ( condition ){

                //CODE

            }
            else{

                //CODE

            }
         */

//        int sayi;
//        Scanner inputTaker = new Scanner(System.in);
//        System.out.print("Bir sayi girin = ");
//        sayi = inputTaker.nextInt();
//
//        if (sayi<0){
//            System.out.println("Sayi negatif");
//        }
//        else if (sayi == 0){
//            System.out.println("Number is 0");
//        }
//        else {
//            System.out.println("Sayi pozitif");
//        }
//
//
//        Scanner inputTaker = new Scanner(System.in);
//        System.out.print("Bir sayi girin = ");
//        int sayi = inputTaker.nextInt();
//        if (sayi % 2 == 0) {
//            System.out.println("Bu bir cift sayidir");
//        }
//        else{
//            System.out.println("Bu bir tek sayidir");
//        }

//        Scanner inputTaker = new Scanner(System.in);
//        System.out.print("Sayi 1 =");
//        int sayi1 = inputTaker.nextInt();
//        System.out.print("Sayi 2 =");
//        int sayi2 = inputTaker.nextInt();
//        System.out.print("Sayi 3 =");
//        int sayi3 = inputTaker.nextInt();
//
//        if (sayi1 > sayi2 && sayi1 > sayi3) {
//            System.out.println("Sayi 1 en buyuktur.");
//            if (sayi2 > sayi3) {
//                System.out.println("Sayi 2 ortancadir.\nSayi 3 en kucuktur.");
//            } else {
//                System.out.println("Sayi 3 ortancedir. \nSayi 2 en kucuktur.");
//            }
//        } else if (sayi2 > sayi3 && sayi2 > sayi1) {
//            System.out.println("Sayi 2 en buyuktur");
//            if (sayi1 > sayi3) {
//                System.out.println("Sayi 1 ortancadir. \nSayi 3 en kucuktur.");
//            } else {
//                System.out.println("Sayi 3 ortancadir. \nSayi 1 en kucuktur.");
//            }
//        } else {
//            System.out.println("Sayi 3 en buyuktur");
//            if (sayi1 > sayi2) {
//                System.out.println("Sayi 1 ortancadir. \nSayi 2 en kucuktur.");
//            } else {
//                System.out.println("Sayi 2 ortancadir. \nSayi 1 en kucuktur.");
//            }
//        }

        /*
                switch (expression) {
                    case val1:
                        //CODE
                        break;
                    case val2:
                        //CODE
                        break;

                        .
                        .
                        .
                    default:
                        //CODE
                        break;
                }
         */

//        int num = 44;
//
//        switch (num) {
//            case 29 -> System.out.println("Small");
//            case 42 -> System.out.println("Medium");
//            case 44 -> System.out.println("Large");
//            case 48 -> System.out.println("XLarge");
//            default -> System.out.println("Unknown!");
//        }

        //For
        //While
        //Do-While

//        for (int i=0; i<5; i++){
//            System.out.println(i);
//        }

//        Scanner inputTaker = new Scanner(System.in);
//        System.out.println("Bir sayi girin");
//        int sayi = inputTaker.nextInt();
//        for (int i = 0; i <= sayi; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }


//        Scanner inputTaker = new Scanner(System.in);
//        System.out.print("Bir sayi girin =");
//        int sayi = inputTaker.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= sayi; i++) {
//            sum += i;
//        }
//
//        System.out.println("Toplam =" + sum);

//        Scanner inputTaker = new Scanner(System.in);
//        System.out.print("Bir sayi girin =");
//        int sayi = inputTaker.nextInt();
//
//        boolean isPrime = true;
//
//        for (int i=2; i<=sayi/2; i++){
//            if(sayi%i==0){
//                isPrime = false;
//                break;
//            }
//        }
//
//        if(isPrime)
//            System.out.println("Prime!");
//        else
//            System.out.println("Not Prime!");

//        for (int i=-100; i<=100; i++){
//            boolean isPrime = true;
//
//            if(i < 2)
//                isPrime = false;
//
//            for (int j=2; j<=i/2; j++){
//                if(i%j==0){
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if(isPrime)
//                System.out.println("Number "+ i +" is Prime!");
//            else
//                System.out.println("Number "+ i +" is not Prime!");
//        }

//        int[] numbers = {10,20,30,40,50};
//
//        for (int number : numbers) {
//            System.out.print(number +", ");
//        }

//        for(int i = 1; i<=10; i++){
//            System.out.print("X");
//        }

        //Write a java code that calculates factorial of a number given by user.

//        Scanner inputTaker = new Scanner(System.in);
//        System.out.print("Enter a number = ");
//        int num = inputTaker.nextInt();
//        int fact = 1;
//        for (int i = 1; i <= num; i++) {
//            fact = fact*i;
//        }
//        System.out.println("Factorial = " + fact);

        

    }
}

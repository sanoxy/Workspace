import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Bicycle sportBicycle = new Bicycle();
//        sportBicycle.breaking();
//        Scanner scanner = new Scanner(System.in);
//        Lamp led = new Lamp();
//        Lamp halogen = new Lamp();
//        led.turnOn();
//        halogen.turnOff();

//        System.out.println(addNumber(5,6));

//        System.out.println(square(5));
//        System.out.println(add(10));

//        System.out.println(isPrime(4));

//        primeNumbers(0, 100);

//        System.out.println(factorial(6));

//        System.out.println(ebob(10,45));
//        System.out.println(ekok(18,6));

//        System.out.println(reverseString("Java Programming!"));
//        System.out.println(power(3,4));

//        System.out.println(factorial(5));
//        System.out.println(power(3,4));
//        System.out.println(add(10));

//        System.out.println(ekok(7,6));

//        System.out.println(binToDec(1101));

//        System.out.println(convert(7));

    }

    //RECURSION ÖZYİNELEME


//    static long convert(long number){
//        long bin = 0;
//        long rem;
//        int i = 1;
//
//        while(number != 0){
//            rem = number % 2;
//            number /= 2;
//            bin += rem * i;
//            i *= 10;
//        }
//
//        return bin;
//    }

//    static long binToDec(long number){
//        long dec = 0;
//        long rem;
//        int i = 0;
//        while(number != 0){
//            rem = number % 10;
//            number /= 10;
//            dec += rem * Math.pow(2,i);
//            i++;
//        }
//        return dec;
//    }


//    static int ebob(int num1, int num2){
//        if (num2==0)
//            return num1;
//        return ebob(num2,num1%num2);
//    }
//
//    static int ekok(int num1, int num2){
//        return num1/(ebob(num1, num2))*num2;
//    }

//    static int add(int number) {
//        if (number == 1)
//            return 1;
//        return number + add(number - 1);
//    }

//    static int factorial(int number){
//        if(number == 1)
//            return 1;
//        return number*factorial(number-1);
//    }

//    static int power(int base, int exponent){
//        if(exponent==0)
//            return 1;
//        return base*power(base,exponent-1);
//    }


//    static int power(int base, int exponent) {
//        int answer = 1;
//        for (int i = 1; i <= exponent; i++) {
//            answer *= base;
//        }
//        return answer;
//    }

//    static String reverseString(String message) {
//        StringBuilder answer = new StringBuilder();
//        for (int i = message.length() - 1; i >= 0; i--) {
//            answer.append(message.charAt(i));
//        }
//        return answer.toString();
//    }

//    static int ekok(int num1, int num2) {
//        int max = Math.max(num1, num2);
//        for (int i = max; true; i++) {
//            if (i % num1 == 0 && i % num2 == 0) {
//                return i;
//            }
//        }
//    }

//    static int ebob(int num1, int num2){
//        int min = Math.min(num1, num2);
//
//        for(int i = min; i>0; i--){
//            if(num1 % i == 0 && num2 % i == 0){
//                return i;
//            }
//        }
//        return -1;
//    }

//    static int factorial(int num) {
//        int answer = 1;
//        for (int i = 1; i <= num; i++) {
//            answer *= i;
//        }
//        return answer;
//    }

//    static void primeNumbers(int min, int max) {
//        for (int i = min; i <= max; i++) {
//            if (isPrime(i)) {
//                System.out.println("Number " + i + " is prime!");
//            } else {
//                System.out.println("Number " + i + " is not prime!");
//            }
//        }
//    }
//
//    static boolean isPrime(int number) {
//        if (number < 2) {
//            return false;
//        }
//        for (int i = 2; i <= number / 2; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

//    static int add(int sayi) {
//        int toplam = 0;
//        for (int i = 0; i <= sayi; i++) {
//            toplam += i;
//        }
//        return toplam;
//    }

//    static int square(int num){
//        return num * num;
//    }

//    public static int addNumber(int a, int b) {
//        return a + b;
//    }
}

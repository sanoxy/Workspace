#include <stdio.h>
#include <stdbool.h>
#pragma warning (disable:4996)

int main() {
    /*bool isPrime = true;
    int number;
    printf("Enter a number:");
    scanf_s("%d", &number);

    if (number < 2) {
        isPrime = false;
    }

    for (int i = 2; i < number / 2; i++) {
        if (number % i == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime == false) {
        printf("Number is not prime");
    }
    else
        printf("Number is prime");*/

    /*int number1, number2;
    printf("Please enter two numbers:");
    scanf("%d %d", &number1, &number2);

    if (number1 > number2) {
        int temp = number1;
        number1 = number2;
        number2 = temp;
    }


    for (int i = number1; i <= number2; i++) {
        bool isPrime = true;

        if (i < 2) {
            isPrime = false;
        }

        for (int j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime == false) {
            printf("Number %d is not prime\n", i);
        }
        else
            printf("Number %d is prime\n", i);
    }*/

    /*
    
    ------------TRIANGLE-1------------
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
------------TRIANGLE-2------------
A
B B
C C C
D D D D
E E E E E
------------TRIANGLE-3------------
* * * * *
* * * *
* * * 
* *
*
    */

    /*int rows;
    printf("Enter the number of rows");
    scanf("%d", &rows);

    for (int i = rows; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            printf("* ");
        }
        printf("\n");
    }*/

    //int rows;
    //printf("Enter the number of rows");
    //scanf("%d", &rows);

    //for (int i = 1; i <= rows; i++) {
    //    for (int j = 1; j <= i; j++) {
    //        printf("%d ", j); //1 2 3
    //    }
    //    printf("\n");
    //}

    //char input, alphabet = 'A';
    //printf("Enter a character");
    //scanf("%c", &input);

    //if (input >= 97 || input <= 122) {
    //    input -= 32;
    //}

    //for (int i = 1; i <= (input-'A' + 1); i++) {
    //    for (int j = 1; j <= i; j++) {
    //        printf("%c ", alphabet); //1 2 3
    //    }
    //    ++alphabet;
    //    printf("\n");
    //}





    return 0;
}
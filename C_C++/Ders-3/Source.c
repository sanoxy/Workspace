#include <stdio.h>
#include <stdbool.h>
#pragma warning (disable:4996)
//int addNumbers(int n1, int n2) {		// Function Declaration
//	return n1 + n2;						// Return statement 
//}
//
//void isPrime(int number) {
//	bool flag = true;
//
//	for (int i = 2; i <= number / 2; i++) {
//		if (number % i == 0) {
//			flag = false;
//			break;
//		}
//	}
//
//	if (flag) {
//		printf("%d is prime!", number);
//	}
//	else {
//		printf("%d is not prime!", number);
//	}
//}

//int fibo(int number) {
//	if (number < 3) {
//		return 1;
//	}
//	else {
//		return fibo(number - 1) + fibo(number - 2);
//	}
//}
//
//void prime(int min, int max) {
//	for (int i = min;i < max; i++) {
//		bool flag = true;
//
//		for (int j = 2; j <= i / 2; j++) {
//			if (i % j == 0) {
//				flag = false;
//				break;
//			}
//		}
//
//		if (flag) {
//			printf("%d is prime!\n", i);
//		}
//		else{
//			printf("%d is not prime!\n", i);
//
//		}
//	}
//}
//int addnums(int number) {
//	if (number > 0) {
//		return number + addnums(number - 1);
//	}
//	else {
//		return number;
//	}
//}

//int factor(int number) {
//	if (number > 0) {
//		return number * factor(number - 1);
//	}
//	else {
//		return 1;
//	}
//}

//int GCD(int n1, int n2) {
//	if (n2 != 0) {
//		return GCD(n2, n1 % n2);
//	}
//	else {
//		return n1;
//	}
//}

//int kuvvet(int base,int exp) {
//	if (exp != 0) {
//		return base * kuvvet(base, exp - 1);
//	}
//	else {
//		return 1;
//	}
//}

int main() {

	//int n1, n2;

	//printf("Enter two numbers: ");
	//scanf("%d %d", &n1, &n2);

	//int sum = addNumbers(n1, n2);		// Function Call
	//printf("Sum = %d", sum);

	//int number;
	//printf("Enter an number: ");
	//scanf("%d", &number);

	//isPrime(number);

	/*int number;
	printf("Enter an number: ");
	scanf("%d", &number);

	int answer = fibo(number);*/

	/*for (int i = 0; i < 100; i++) {
		int answer = fibo(i);
		printf("%d'th term of fibo is: %d\n", i, answer);
	}*/

	/*int number1, number2;
	printf("Enter two numbers;");
	scanf("%d %d", &number1, &number2);

	prime(number1, number2);*/


	/*int number;
	printf("Enter number;");
	scanf("%d", &number);

	int answer = addnums(number);

	printf("%d", answer);*/

	/*int number;
	printf("Enter number;");
	scanf("%d", &number);

	int answer = factor(number);

	printf("%d", answer);*/

	//GCD	10 15 => 5

	/*int number1, number2;
	printf("Enter two number;");
	scanf("%d %d", &number1,&number2);

	int answer = GCD(number1, number2);

	printf("%d", answer);*/

	/*int answer = kuvvet(3,4);

	printf("%d", answer);*/

/*	int prime(int number) {
		if (%number = 0) {
			return number + addnums(number - 1);
		}
		else {
			return number;
		}
	}*/

/*void prime(int min, int max) {
	for (int i = min;i < max; i++) {
		bool flag = true;

		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				flag = false;
				break;
			}
		}*/

	int number, i;
	printf("Enter an integer =");
	scanf("%d", &number);
	if (number == 0 || n == 1)
		for (i = 2; j <= number / 2; i++) {
			if (number % i == 0) {
				printf("%d is prime!\number", i);
			}
			else {
				printf("%d is not prime!\number", i);

	return 0;
}
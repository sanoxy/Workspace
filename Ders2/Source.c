#include <stdio.h>
#pragma warning (disable:4996)
int main() {

	/*
						FLOW CONTROL
			1. Control mechanisms 
				*İF-Else Structure
					if(test expression){
						//CODE		
					
					}

					else if(test expression){

					}

					else if(...){
						//CC

					}
					else{
						//FF

					}
				*Switch Case
				
			2. Loops
				* for Loop
				* 
				* 
				* while loop
				* 
				* 
				* do while loop

	*/

	/*int number;
	printf("Enter an integer =");
	scanf("%d", &number);

	if (number > 0) {
		printf("Pozitif");
	}
	else if (number == 0) {
		printf("Sifir");
	}
	else {
		printf("Negatif");
	}*/

	/*int number;
	printf("Enter an integer =");
	scanf("%d", &number);

	if (number %2 == 0) {
		printf("Number is even.");
	}
	else {
		printf("Number is odd.");
	}*/

	/*int number1, number2;

	printf("Enter two numbers = ");
	scanf("%d %d", &number1, &number2);

	if (number1 > number2) {
		printf("Number1 daha buyuk");
	}
	else if (number2 > number1) {
		printf("Number2 daha buyuk");

	}
	else
		printf("Sayilar esit");*/

	/*int number1, number2, number3;

	printf("Enter 3 numbers = ");
	scanf("%d %d %d", &number1, &number2, &number3);

	if (number1>number2 && number1>number3){
		if (number2 > number3) {
			printf("Number1>Number2>Number3");
		}
		else {
			printf("Number1>Number3>Number2");
		}	
	}
	else if (number2 > number1 && number2 > number3) {
		if (number1 > number3) {
			printf("Number2>Number1>Number3");
		}
		else {
			printf("Number2>Number3>Number1");
		}
	}
	else {
		if (number1 > number2) {
			printf("Number3>Number1>Number2");
		}
		else {
			printf("Number3>Number2>Number1");
		}
	}*/
		
	/*char operation;
	double n1 = 0, n2 = 0;

	printf("Enter an operator (+,-,*,/): ");
	scanf("%c", &operation);
	printf("Enter two operands: ");
	scanf("%lf %lf", &n1, &n2);

	switch (operation) {
	case '+':
		printf("%.2lf + %.2lf = %.2lf", n1, n2, n1 + n2);
		break;
	case '-':
		printf("%lf - %lf = %lf", n1, n2, n1 - n2);
		break;
	case '*':
		printf("%lf * %lf = %lf", n1, n2, n1 * n2);
		break;

	case '/':
		printf("%lf / %lf = %lf", n1, n2, n1 / n2);
		break;

	default:
		printf("Error! Operator is not correct!");
		break;

	}*/

	/*for (int i = 0; i < 100; i++) {
		printf("%d\n", i);
	}*/

	/*int number1, number2;

	printf("Enter two numbers = ");
	scanf("%d %d", &number1, &number2);

	for (int i = number1;i <= number2; i++) {
		printf("%d\n", i);
	}*/

	/*int number1, number2;
	printf("Enter two numbers = ");
	scanf("%d %d", &number1, &number2);

	while (number1 < number2) {
		printf("%d\n", number1);
		number1++;
	}*/
	/*int number1, number2;
	printf("Enter two numbers = ");
	scanf("%d %d", &number1, &number2);

	do {
		printf("%d\n", number1);
		number1++;
	} while (number1 < number2);*/

	//int number, sum = 0;
	//printf("Enter a number =");
	//scanf("%d", &number);

	//for (int i = 0; i <= number;i++){
	//	sum += i; // sum = sum + i	
	//}
	//

	//printf("%d", sum);

	//int number1, factorial = 1;
	//printf("Enter number = ");
	//scanf("%d", &number1);

	//while (number1 > 0) {
	//	factorial = number1 * factorial; //factorial *= number1;
	//	number1--;
	//}

	//printf("Factorial: %d", factorial);

	

	return 0;
}
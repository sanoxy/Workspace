#include <stdio.h>
#include <string.h>
#pragma warning (disable:4996)

void add(int matrix1[4][4], int matrix2[4][4], int sum[4][4]) {
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			sum[i][j] = matrix1[i][j] + matrix2[i][j];
		}
	}
}

void mult(int matrix1[4][4], int matrix2[4][4], int result[4][4]) {
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			for (int k = 0; k < 4; k++) {
				result[i][j] += matrix1[i][k] * matrix2[k][j];
			}
		}
	}
}

void printMatrix(int matrix[4][4]) {
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			printf("%d ", matrix[i][j]);
		}
		printf("\n");
	}
}

void fillMatrix(int matrix[4][4]) {
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			matrix[i][j] = j;
		}
	}
}

void findTranspose(int matrix[4][4], int result[4][4]) {
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			result[j][i] = matrix[i][j];
		}
	}
}

void atama(int* a, int* b, int* c) {
	printf("--------------------FUNCTION START--------------------\n");

	printf("Value before swapping:\n");
	printf("a = %d \nb = %d \nc = %d\n", *a, *b, *c);

	int temp;
	temp = *a;
	*a = *c;
	*c = *b;
	*b = temp;

	printf("Value after swapping:\n");
	printf("a = %d \nb = %d \nc = %d\n", *a, *b, *c);

	printf("--------------------FUNCTION END--------------------\n");
}

void displayString(char str[]) {
	printf("Output: ");
	puts(str);
}

void reverse() {
	char c;
	scanf("%c", &c);

	if (c != '\n') {
		reverse();
		printf("%c", c);
	}
}

int main() {

	/*
			Write a function that takes 2 matrices as params and calculates their summation and prints.

			Write a function that takes 2 matrices as params and calculates their multiplication and prints.

			Write a function that takes a matrix aand finds transpose of it.

			Swap numbers in the cyclic order using call by referance. (use pointers)
	*/

	//int matrix1[4][4], matrix2[4][4], sum[4][4];

	//fillMatrix(matrix1);
	//fillMatrix(matrix2);
	//

	//add(matrix1, matrix2, sum);

	//printf("Matrix-1: \n");
	//printMatrix(matrix1);

	//printf("Matrix-2: \n");
	//printMatrix(matrix2);

	//printf("Sum: \n");
	//printMatrix(sum);



	/*int matrix1[4][4], matrix2[4][4], result[4][4];

	fillMatrix(matrix1);
	fillMatrix(matrix2);
	fillMatrix(result);

	printf("Matrix-1: \n");
	printMatrix(matrix1);

	printf("Matrix-2: \n");
	printMatrix(matrix2);

	mult(matrix1, matrix2, result);

	printf("Result: \n");
	printMatrix(result);*/

	/*int matrix1[4][4], result[4][4];
	fillMatrix(matrix1);
	fillMatrix(result);

	findTranspose(matrix1, result);

	printf("Matrix-1: \n");
	printMatrix(matrix1);

	printf("Result: \n");
	printMatrix(result);*/

	//int a = 1, b = 2, c = 3;

	//printf("Value before swapping:\n");
	//printf("a = %d \nb = %d \nc = %d\n", a, b, c);

	//atama(&a, &b, &c);

	//printf("Value after swapping:\n");
	//printf("a = %d \nb = %d \nc = %d", a, b, c);

	//char c[] = "abcd";
	//char c[50] = "abcd\0";
	//char c[] = { 'a','b','c','d','\0' };
	//char c[5] = { 'a','b','c','d','\0' };

	//char c[100];
	//c = "C programming"; //Invalid!

	/*char name[20];
	printf("Enter your name: ");
	scanf("%s", name);
	printf("Your name is: %s", name);*/

	/*char name[20];
	printf("Enter your name: ");
	fgets(name, sizeof(name), stdin);
	printf("Name: ");
	puts(name);*/

	/*char str[50];
	printf("Enter string: ");
	fgets(str, sizeof(str), stdin);
	//displayString(str);*/

	//char name[] = "Harry Potter";

	//printf("%c", *name); // H
	//printf("%c", *(name + 1)); //a
	//printf("%c", *(name + 7)); //o

	//char* namePtr;
	//namePtr = name;

	//printf("%c", *namePtr); //H
	//printf("%c", *(namePtr + 1)); //a
	//printf("%c", *(namePtr + 7)); //o

	//char a_UserName[50] = "admin\n";
	//char a_Pass[50] = "1234\n";

	//char username[50];
	//char pass[50];

	//printf("Enter username: ");
	//fgets(username, sizeof(username), stdin);
	//printf("Enter password: ");
	//fgets(pass, sizeof(pass), stdin);

	////strlwr(username);

	//if (strcmp(username, a_UserName) == 0 && strcmp(pass, a_Pass) == 0) {
	//	printf("Welcome");
	//}
	//else if (strcmp(username, a_UserName) != 0 && strcmp(pass, a_Pass) == 0) {
	//	printf("Wrong username");
	//}
	//else if (strcmp(username, a_UserName) == 0 && strcmp(pass, a_Pass) != 0) {
	//	printf("Wrong password");
	//}
	//else {
	//	printf("Wrong username and password");
	//}

	/*
	*
		Enter a string: This website is awesome.
		Enter a character to find its frequency: e
		Frequency of e = 4

	*/

	/*char myString[] = "This website is awesome.";
	char target = 'a';
	int counter = 0;

	for (int i = 0;myString[i] != '\0';i++) {
		if (myString[i] == target)
			counter++;
	}

	printf("Frequency of %c is = %d", target, counter);*/

	/*
	
			Enter a sentence: margorp emosewa
			awesome program
	
	*/

	//printf("Enter a sentence: ");
	//reverse();

	/*char s[] = "Programming is fun";
	int i;

	for (i = 0;s[i] != '\0';i++) {}

	printf("%d", i);*/

	/*
		Enter a string: a2g21c6#+/+½6{kfh
		Output: agckfh

	*/

	char myString[] = "agc#+/+½6{kfh";

	/*for (int i = 0;myString[i] != '\0';i++) {
		if (!(myString[i] >= 'a' && myString[i] <= 'z') && !(myString[i] >= 'A' && myString[i] <= 'Z') && !(myString[i] == '\0')) {
			int j;
			for (j = i; myString[j] != '\0'; j++) {
				myString[j] = myString[j + 1];
				
			}
			myString[j] = '\0';
		}

		if (!(myString[i] >= 'a' && myString[i] <= 'z') && !(myString[i] >= 'A' && myString[i] <= 'Z')) {
			i--;
		}
	}*/

	/*for (int i = 0; myString[i] != '\0'; i++) {
		while (!(myString[i] >= 'a' && myString[i] <= 'z') && !(myString[i] >= 'A' && myString[i] <= 'Z') && !(myString[i] == '\0')) {
			int j;
			for (j = i; myString[j] != '\0'; j++) {
				myString[j] = myString[j + 1];
				counter++;
			}
			myString[j] = '\0';
		}
	}*/

	/*printf("\n");
	puts(myString);*/

	/*char s1[100], s2[100];
	printf("Enter string 1: ");
	fgets(s1, sizeof(s1), stdin);
	int i;
	for (i = 0; s1[i] != '\0'; i++) {
		s2[i] = s1[i];
	}
	s2[i] = '\0';

	printf("String 2 = %s", s2);*/

	/*
			Sort strings in the dictionary order
	*/
	



	return 0;
}





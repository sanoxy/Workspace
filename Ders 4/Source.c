#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#pragma warning (disable:4996)

//void fillArray(int notlar[3][3],int matrixNumber) {
//	for (int i = 0; i < 3; i++) {
//		for (int j = 0; j < 3; j++) {
//			printf("Matrix%d[%d][%d] = ",matrixNumber, i, j);
//			scanf("%d", &notlar[i][j]);
//		}
//	}
//}
//
//void getAvg(int notlar[3][3]) {
//	double sum = 0;
//	for (int row = 0; row < 3;row++) {
//		for (int col = 0; col < 3; col++) {
//			sum += notlar[row][col];
//		}
//	}
//	printf("Notlarin ortalamasi: %.1lf", sum / 9);
//}
//
//void carp(int matrix1[3][3], int matrix2[3][3], int result[3][3]) {
//	for (int i = 0; i < 3; i++) {
//		for (int j = 0;j < 3; j++) {
//			result[i][j] = matrix1[i][j] * matrix2[i][j];
//		}
//	}
//}
//
//void printmatrix(int matrix[3][3]) {
//	for (int i = 0; i < 3; i++) {
//		for (int j = 0;j < 3; j++) {
//			printf("%d ", matrix[i][j]);
//		}
//		printf("\n");
//	}
//}

//void swap(int *a, int *b) {
//	int temp = *a;
//	*a = *b;
//	*b = temp;
//}

//float calculate(float data[]) {
//	float sum = 0.0, mean, SD = 0.0;
//	for (int i = 0; i < 10; i++) {
//		sum += data[i];
//	}
//
//	mean = sum / 10;
//
//	for (int i = 0; i < 10; i++) {
//		SD += pow(data[i] - mean, 2);
//	}
//
//	return sqrt(SD / 10);
//}

int main() {
	/*int mark[5] = { 1,2,3,4,5 };
	int mark[] = { 1,2,3,4,5 };
	int mark[5];
	mark[0] = 1;
	mark[1] = 2;*/

	/*int values[5];

	printf("Enter 5 integers\n");

	for (int i = 0; i < 5; i++) {
		printf("Values[%d] = ", i);
		scanf("%d", &values[i]);
	}

	printf("\nDisplaying Integers: \n");

	for (int i = 0; i < 5; i++) {
		printf("Values[%d] = %d\n", i, values[i]);
	}*/

	/*int marks[10];
	printf("Please enter 10 numbers:\n");
	for (int i = 0; i < 10; i++) {
		scanf("%d", &marks[i]);
	}

	int sum = 0;
	for (int i = 0; i < 10; i++) {
		sum += marks[i];
	}


	printf("Average is: %.1lf", (double)sum / 10);*/

	/*int c[2][3] = { {1,2,3},{-2,-5,-9} };
	int c[][3] = { {1,3,5},{4,5,6} };
	int c[2][3] = { 1,2,3,4,5,6 };
	int c[2][3];*/

	/*int matrix[3][3];

	printf("Enter Information: \n");

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			printf("Matrix[%d][%d] = ", i, j);
			scanf("%d", &matrix[i][j]);
		}
	}

	printf("\nPrinting Information: \n");

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			printf("Matrix[%d][%d] = %d\n", i, j, matrix[i][j]);
		}
		printf("\n");
	}*/

	/*int notlar[3][3];
	printf("Notlari girin:\n");

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			printf("Notlar[%d][%d] = ", i, j);
			scanf("%d", &notlar[i][j]);
		}
	}

	double sum = 0;
	for (int row = 0; row < 3;row++) {
		for (int col = 0; col < 3; col++) {
			sum += notlar[row][col];
		}
	}

	printf("Notlarin ortalamasi: %.1lf", sum/9);*/	

	/*int notlar[3][3];
	printf("Notlari girin:\n");
	fillArray(notlar);
	getAvg(notlar);*/

	/*int a[3][3], b[3][3], c[3][3];
	fillArray(a,1);
	fillArray(b,2);
	carp(a, b, c);
	printmatrix(c);*/

	//int var = 5;
	//printf("Value of var = %d\n", var);
	//printf("Adress of var = %p\n", &var);

	//int a = 5, b = 10;
	//swap(a, b);
	//printf("%d %d", a, b);

	/*int c = 5;
	int* ptrC = &c;

	printf("%d", *ptrC);*/

	//int* pc, c;
 //  
 //  c = 22;
 //  printf("Address of c: %p\n", &c); //Adress of c = X
 //  printf("Value of c: %d\n\n", c); //22
 //  
 //  pc = &c;
 //  printf("Address of pointer pc: %p\n", pc); //x
 //  printf("Content of pointer pc: %d\n\n", *pc); //22
 //  
 //  c = 11;
 //  printf("Address of pointer pc: %p\n", pc); //X
 //  printf("Content of pointer pc: %d\n\n", *pc); //11
 //  
 //  *pc = 2;
 //  printf("Address of c: %p\n", &c); //X
 //  printf("Value of c: %d\n\n", c);  //

	/*
		int c, *pc;
		pc = c; //Error!
		*pc = &c;	//ERROR!		 
		pc = &c;
		*pc = c;

	*/

	/*int x[4];

	for (int i = 0; i < 4; i++) {
		printf("&x[%d] = %p\n", i, &x[i]);
	}

	printf("Adress of array: %p", x);*/
	
	//int x[6], sum = 0;

	//printf("Enter 6 numbers: \n");

	//for (int i = 0; i < 6; i++) {
	//	scanf("%d", x + i); // scanf("%d",&x[i]);
	//	sum += *(x + i);
	//}

	//printf("Sum = %d", sum);

	/*int a = 5, b = 10;
	swap(&a, &b);
	printf("%d %d", a, b);*/

	/*int array[5];
	printf("Enter 5 numbers: \n");

	for (int i = 0; i < 5; i++) {
		scanf("%d", array + i);
	}

	int max = INT_MIN;

	for (int i = 0; i < 5; i++) {
		if (max < *(array + i))
			max = *(array + i);
	}

	printf("Max = %d", max);*/

	/*int noOfNumbers;
	printf("Enter number of elements: ");
	scanf("%d", &noOfNumbers);

	int* ptr = (int*)malloc(noOfNumbers * sizeof(int));

	if (ptr == NULL) {
		printf("ERROR!");
		exit(0);
	}

	printf("Enter elements: \n");
	for (int i = 0; i < noOfNumbers; i++) {
		printf("Element %d:", i);
		scanf("%d", ptr + i);
	}

	int sum = 0;
	for (int i = 0; i < noOfNumbers; i++) {
		sum += *(ptr + i);
	}

	printf("Sum = %d", sum);
	free(ptr);*/

	//float data[10];
	//printf("Enter 10 elements: \n");
	//for (int i = 0; i < 10; i++) {
	//	scanf("%f", data + i);
	//}

	//printf("\nStd Deviation of array is = %.6f", calculate(data));

	/*
			Write a function that takes 2 matrices as params and calculates their summation and prints.

			Write a function that takes 2 matrices as params and calculates their multiplication and prints.
	
			Write a function that takes a matrix aand finds transpose of it.

			Swap numbers in the cyclic order using call by referance. (use pointers)
	*/

	//system("PAUSE");
	return 0;
}





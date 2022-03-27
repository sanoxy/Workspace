#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>
#pragma warning (disable:4996)
#define PI 3.14
#define circleArea(r) (3.14*r*r)

struct Person
{
	int age;
	float weight;
	char name[50];
};

//struct complex {
//	int imag;
//	float real;
//};
//
//struct number {
//	struct complex comp;
//	int integers;
//};

void takeInput(int noOfPerson, struct Person* ptr) {
	for (int i = 0; i < noOfPerson; i++) {
		printf("Enter name and age respectively: ");
		scanf("%s %d", (ptr + i)->name, &(ptr + i)->age);
	}
}

void printInfo(int noOfPerson, struct Person* ptr) {
	printf("****************** Dislaying Information ******************\n");
	for (int i = 0; i < noOfPerson; i++)
		printf("Name: %s\tAge: %d\n", (ptr + i)->name, (ptr + i)->age);
}

struct time {
	int hour;
	int min;
	int sec;

};

struct threeNum {
	int n1, n2, n3;
};

struct student {
	char name[50];
	int mark;
};

int main() {
	/*struct Person person1;

	person1.salary = 2500;
	person1.citNo = 1984;
	strcpy(person1.name, "Ayberk");

	printf("Name: %s\n", person1.name);
	printf("CitNo: %d\n", person1.citNo);
	printf("Salary: %.2f", person1.salary);*/

	/*struct number num1;

	num1.comp.imag = 11;
	num1.comp.real = 5.25;
	num1.integers = 6;

	printf("Imaginary Part: %d\n", num1.comp.imag);
	printf("Real Part: %.2f\n", num1.comp.real);
	printf("Integer: %d", num1.integers);*/

	/*struct Person* personPtr, person;
	personPtr = &person;

	printf("Enter Age: ");
	scanf("%d", &personPtr->age);

	printf("Enter weight: ");
	scanf("%f", &personPtr->weight);

	printf("Displaying:\n");
	printf("Age: %d\n", personPtr->age);
	printf("Weight: %f\n", personPtr->weight);*/

	/*int noOfPerson;
	printf("Enter the number of persons: ");
	scanf("%d", &noOfPerson);

	struct Person* ptr;

	ptr = (struct Person*) malloc(noOfPerson * sizeof(struct Person));
	takeInput(noOfPerson, ptr);
	printInfo(noOfPerson, ptr);*/

	/*struct time t1;
	struct time t2;
	struct time differance;

	t1.hour = 13;
	t1.min = 34;
	t1.sec = 55;

	t2.hour = 8;
	t2.min = 12;
	t2.sec = 15;

	int time1Sec = t1.hour * 3600 + t1.min * 60 + t1.sec;
	int time2Sec = t2.hour * 3600 + t2.min * 60 + t2.sec;

	int finalSec = abs(time1Sec - time2Sec);

	differance.hour = finalSec / 3600;
	finalSec %= 3600;

	differance.min = finalSec / 60;
	finalSec %= 60;

	differance.sec = finalSec;

	printf("Differance is: %d:%d:%d", differance.hour, differance.min, differance.sec);*/

	/*int num;
	FILE* fptr;

	fptr = fopen("test.txt", "w");

	if (fptr == NULL) {
		printf("Error!");
		exit(1);
	}

	printf("Enter num: ");
	scanf("%d", &num);

	fprintf(fptr, "%d", num);
	fclose(fptr);*/

	/*int num;
	FILE* fptr;

	fptr = fopen("test.txt", "r");

	if (fptr == NULL) {
		printf("Error!");
		exit(1);
	}

	fscanf(fptr, "%d", &num);
	printf("Value of num: %d", num);*/

	//struct threeNum num;
	/*FILE* fptr;

	if ((fptr = fopen("program.bin", "wb")) == NULL) {
		printf("Error!");
		exit(-1);
	}

	for (int i = 1; i < 5; i++) {
		num.n1 = i;
		num.n2 = 5 * i;
		num.n3 = 5 * i + 1;
		fwrite(&num, sizeof(struct threeNum), 1, fptr);
	}

	fclose(fptr);*/

	/*struct threeNum num;
	FILE* fptr;

	if ((fptr = fopen("program.bin", "rb")) == NULL) {
		printf("Error!");
		exit(-1);
	}

	for (int i = 1; i < 5; i++) {
		fread(&num, sizeof(struct threeNum), 1, fptr);
		printf("n1: %d\tn2: %d\tn3: %d\n", num.n1, num.n2, num.n3);
	}

	fclose(fptr);*/

	/*char name[50];
	int mark, num;

	printf("Enter the number of students: ");
	scanf("%d", &num);
	
	FILE* fptr;
	if ((fptr = fopen("students.txt", "a")) == NULL) {
		printf("Error!");
		exit(-1);
	}
	for (int i = 0; i < num; i++) {
		printf("For student-%d\nEnter name: ", i);
		scanf("%s", name);

		printf("Enter marks: ");
		scanf("%d", &mark);

		fprintf(fptr, "\nName: %s \nMarks: %d\n", name, mark);
	}

	fclose(fptr);*/

	/*struct student student1[5], student2[5];
	int x;

	FILE* fptr;

	fptr = fopen("file.bin", "wb");

	for (int i = 0; i < 5; i++) {
		fflush(stdin);
		printf("Enter name: ");
		scanf("%s", student1[i].name);

		printf("Enter mark: ");
		scanf("%d", &student1[i].mark);
	}

	fwrite(student1, sizeof(student1), 1, fptr);
	fclose(fptr);

	fptr = fopen("file.bin", "rb");
	fread(student2, sizeof(student2), 1, fptr);

	for (int i = 0; i < 5; i++) {
		printf("Name: %s\nMark: %d\n\n", student2[i].name, student2[i].mark);
	}
	fclose(fptr);*/

	/*printf("Area : %.2f", circleArea(5));*/

	system("PAUSE");
	return 0;
}
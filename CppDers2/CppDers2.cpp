#include <iostream>
#include <cmath>
#include <string>
using namespace std;

int number = 10;

//void greet() {
//	cout << "Hello world" << endl;
//}
//
//void displaynumber(int n1, float n2) {
//	cout << "N1: " << n1 << endl;
//	cout << "N2: " << n2 << endl;
//}
//
//int add(int n1, int n2) {
//	return n1 + n2;
//}
//
//int count() {
//	number++;
//	return number;
//}

//bool isPrime(int number) {
//	if (number < 2)
//		return false;
//	for (int i = 2;i <= number / 2;i++){
//		if (number % i == 0) {
//			return false;
//		}	
//	}
//	return true;
//}
//
//void displayPrimeNumbersBetweenXandY(int begin, int end) {
//	for (int i = begin; i <= end; i++) {
//		if (isPrime(i)) {
//			cout << i << " is prime!" << endl;
//		}
//		else {
//			cout << i << " is not prime!" << endl;
//		}
//	}
//}

//OVERLOADING!

//int test(){}
//int test(int a){}
//float test(double a){}

//int mutlakdeger(int n) {
//	if (n < 0) {
//		n = n * -1;
//	}
//	return n;
//}
//
//float mutlakdeger(float n) {
//	if (n < 0) {
//		n = n * -1;
//	}
//	return n;
//}
//
//double mutlakdeger(double n) {
//	if (n < 0) {
//		n = n * -1;
//	}
//	return n;
//}

//void display(char c = '*', int count = 3) {
//	for (int i = 1; i <= count; i++) {
//		cout << c;
//	}
//	cout << endl;
//}

//int factorial(int n) {
//	if (n == 1)
//		return 1;
//
//	return n * factorial(n - 1);
//}

//int fibo(int n) {
//	if (n <= 2)
//		return 1;
//	return fibo(n - 1) + fibo(n - 2);
//}

//double findAvg(double numbers[5]) {
//	double average;
//	double sum = 0;
//	int count = 0;
//
//	for (int i = 0; i < 5; i++) {
//		count++;
//		sum += numbers[i];
//	}
//
//	average = sum / count;
//	return average;
//}

//void greeting(string name) {
//	cout << "Hello " << name << endl;
//}

//class Room {
//public:
//	double length;
//	double breadth;
//	double height;
//
//	//Default Constructor
//	Room() {
//		this->height = 0;
//		this->breadth = 0;
//		this->length = 0;
//
//		cout << "Default Constructor!" << endl;
//	}
//
//	//Parameterized Constructor
//	Room(double lenght, double breadth, double height) {
//		this->length = lenght;
//		this->breadth = breadth;
//		this->height = height;
//
//		cout << "Parameterized Constructor!" << endl;
//	}
//
//	//Copy Constructor
//	Room(Room& obj) {
//		this->breadth = obj.breadth;
//		this->length = obj.length;
//		this->height = obj.height;
//
//		cout << "Copy Constructor!" << endl;
//	}
//
//	double calculateArea() {
//		return this->length * this->breadth;
//	}
//
//	double calculateVolume() {
//		return this->length * this->breadth * this->height;
//	}
//};
// 
// 
// 

//class Room {
//private:
//	double length;
//	double breadth;
//	double height;
//public:
//	//Default Constructor
//	Room() {
//		this->height = 0;
//		this->breadth = 0;
//		this->length = 0;
//
//		cout << "Default Constructor!" << endl;
//	}
//
//	//Parameterized Constructor
//	Room(double lenght, double breadth, double height) {
//		this->length = lenght;
//		this->breadth = breadth;
//		this->height = height;
//
//		cout << "Parameterized Constructor!" << endl;
//	}
//
//	//Copy Constructor
//	Room(Room& obj) {
//		this->breadth = obj.breadth;
//		this->length = obj.length;
//		this->height = obj.height;
//
//		cout << "Copy Constructor!" << endl;
//	}
//
//	double calculateArea() {
//		return this->length * this->breadth;
//	}
//
//	double calculateVolume() {
//		return this->length * this->breadth * this->height;
//	}
//};

//
//class Student {
//public:
//	double marks;
//
//	Student(double m) {
//		this->marks = m;
//	}
//};
//
//void calculateAverage(Student s1, Student s2) {
//	double average = (s1.marks + s2.marks) / 2;
//	cout << "Average Mark: " << average << endl;
//}

//Student add5ptr(Student s) {
//	s.marks += 5;
//	return s;
//}

//class Count {
//private:
//	int value;
//public:
//	Count() {
//		this->value = 5;
//	}
//
//	void operator++() {
//		value += 5;
//	}
//
//	void display() {
//		cout << "Count: " << value << endl;
//	}
//};

int main()
{
	int var1 = 3;
	int var2 = 5;
	int var3 = 17;

	cout << "Adress of var1: " << &var1 << endl;
	cout << "Adress of var2: " << &var2 << endl;
	cout << "Adress of var2: " << &var3 << endl;

	int* pointVar;

	pointVar = &var1;

	cout << "Pointer: " << pointVar << endl;



	/*Count c1;
	c1.display();
	++c1;
	c1.display();*/

	/*Student student1(88.0);
	Student newStudent = add5ptr(student1);
	cout << newStudent.marks << endl;*/
	//calculateAverage(student1, student2);

	/*Room room1;
	Room room2(5, 6, 7);
	Room room3 = room2;*/

	//cout << "Area of room: " << room3.calculateArea() << endl;
	//cout << "Volume of room: " << room3.calculateVolume() << endl;

	/*int sum = add(5, 5);
	cout << sum << endl;*/

	/*cout << add(5, 6) << endl;*/

	/*double number, sRoot;
	number = 23.67;

	sRoot = sqrt(number);
	cout << sRoot << endl;*/

	/*cout << count() << endl;
	cout << count() << endl;*/

	/*cout << isPrime(8) << endl;*/
	/*displayPrimeNumbersBetweenXandY(0, 1000);*/

	//cout << mutlakdeger(-9) << endl;
	//cout << mutlakdeger(-9.8) << endl;
	//cout << mutlakdeger(-9.6f) << endl;

	//DEFAULT ARGUMENT

	/*cout << "No argument passed!";
	display();

	cout << "First argument passed!";
	display('#');

	cout << "Both arguments are passed!";
	display('#', 10);*/

	/*cout << factorial(6) << endl;*/
	/*cout << fibo(7) << endl;*/

	/*for (int i = 0; i < 100; i++) {
		cout << "Fibo of " << i << " = " << fibo(i) << endl;
	}*/

	/*int numbers[5];

	numbers[0] = 0;
	numbers[1] = 10;
	numbers[2] = 20;
	numbers[3] = 30;
	numbers[4] = 40;


	cout << numbers[4] << endl;*/

	/*int numbers[100];

	for (int i = 0; i < 100; i++) {
		numbers[i] = i * 10;
	}

	for (int i = 0; i < 100; i++) {
		cout << "numbers[" << i << "] = " << numbers[i] << endl;
	}

	*/

	//int arr[5];
	//cout << "Enter 5 numbers!" << endl;
	//for (int i = 0; i < 5;i++) {
	//	cout << "Enter number " << i << ": ";
	//	cin >> arr[i];
	//}

	//cout << "The numbers are: " << endl;
	//for (int i = 0; i < 5;i++) {
	//	cout << arr[i] << endl;
	//}

	/*double numbers[] = { 7,5,6,12,35,27 };
	double average;
	int sum = 0;
	int count = 0;*/

	//For each
	//for (const double& n : numbers) {
	//	sum += n; // sum = sum + n;
	//	count++;
	//}

	//cout << average << endl;

	//Alternative
	/*int noOfElements = sizeof(numbers) / sizeof(numbers[0]);

	for (int i = 0; i < noOfElements; i++) {
		sum += numbers[i];
	}

	average = (double)sum / noOfElements;*/

	/*int test[3][3] = { {2,-5,9},{4,0,8},{9,1,7} };

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			cout << test[i][j] << "  ";
		}
		cout << endl;
	}*/
	
	/*int numbers[2][3];

	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {
			cout << "arr[" << i << "][" << j << "]: ";
			cin >> numbers[i][j];
		}
	}

	cout << "The numbers are: " << endl;

	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {
			cout << "arr[" << i << "][" << j << "]= " << numbers[i][j] << endl;
		}
		cout << endl;
	}*/

	/*double numbers[] = {2,2,2,2,3};
	cout << findAvg(numbers) << endl;*/

	/*string name = "Erkan";
	name.push_back('k');
	name.pop_back();
	

	cout << name << endl;*/

	//string str;
	//cout << "Enter a string: ";
	///*cin >> str;*/
	///*getline(cin, str);*/

	//cout << "You entered: " << str << endl;

	/*greeting("Ayberk");
	greeting("Erkan");*/


}


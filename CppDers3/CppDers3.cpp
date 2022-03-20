#include <iostream>
#include <math.h>
#include "complexNum.h"
using namespace std;

//void swap(int *i, int *j) {
//    int t = *i;
//    *i = *j;
//    *j = t;
//}

//class Student {
//    int age;
//public:
//    Student() {
//        age = 12;
//    }
//
//    void getAge() {
//        cout << "Age: " << age << endl;
//    }
//};

//class Student {
//private:
//    string name;
//    int age;
//    double grade;
//public:
//    Student(string name, int age, double grade) {
//        this->name = name;
//        this->age = age;
//        this->grade = grade;
//    }
//
//    Student(){}
//
//    void printinfo() {
//        cout << "Name=" << this->name << endl;
//        cout << "Age=" << this->age << endl;
//        cout << "Grade=" << this->grade << endl;
//    }
//
//    void setInfo(string name, int age, double grade) {
//        this->name = name;
//        this->age = age;
//        this->grade = grade;
//    }
//};

//class Animal {
//public:
//    void eat() {
//        cout << "I can eat!" << endl;
//    }
//
//    void sleep() {
//        cout << "I can sleep!" << endl;
//    }
//};
//
//class Dog : public Animal {
//public:
//    void bark() {
//        cout << "I can bark!" << endl;
//    }
//};

//class Animal {
//private:
//    string color;
//protected:
//    string type;
//public:
//    void eat() {
//        cout << "I can eat!" << endl;
//    }
//
//    void sleep() {
//        cout << "I can sleep!" << endl;
//    }
//
//    //Accessor Functions (Encapsulation)
//
//    void setColor(string clr) {
//        this->color = clr;
//    }
//
//    string getColor() {
//        return this->color;
//    }
//};
//
//class Dog : public Animal {
//public:
//    void setType(string type) {
//        this->type = type;
//    }
//
//    void displayInfo() {
//        cout << "I am a " << type << endl;
//        cout << "My color is " << this->getColor() << endl;
//    }
//
//    void bark() {
//        cout << "I can bark!" << endl;
//    }
//};

//class A {
//public:
//    void display() {
//        cout << "A class content" << endl;
//    }
//};
//
//class B : public A {
//
//};
//
//class C : public B {
//
//};

//class Mammal {
//public:
//    Mammal() {
//        cout << "Mammals can give direct birth" << endl;
//    }
//};
//
//class WingedAnimal {
//public:
//    WingedAnimal() {
//        cout << "Winged animal can fly" << endl;
//    }
//};
//
//class Bat : public Mammal, public WingedAnimal {
//
//};

//class Animal {
//public:
//    Animal() {
//        cout << "Animal construcotr!" << endl;
//    }
//    void info() {
//        cout << "I am an aminal" << endl;
//    }
//};
//
//class Dog : public Animal{
//public:
//    Dog() {
//        cout << "Dog constructor!" << endl;
//    }
//    void bark() {
//        cout << "Bark!" << endl;
//    }
//};
//
//class Cat : public Animal {
//public:
//    Cat() {
//        cout << "Cat COnstructor!" << endl;
//    }
//    void meow() {
//        cout << "Meow!" << endl;
//    }
//};

//class Distance {
//private:
//    int meter;
//    friend int addFive(Distance);
//
//public:
//    Distance() {
//        this->meter = 0;
//    }
//};
//
//int addFive(Distance d) {
//    d.meter += 5;
//    return d.meter;
//}

//class Base {
//public:
//    virtual void print() {
//        cout << "Base Function!" << endl;
//    }
//};
//
//class Derived : public Base {
//public:
//    void print() {
//        cout << "Derived Function!" << endl;
//    }
//};

//template<class T>
//
//class Number {
//private:
//    T num;
//public:
//    Number(T num) {
//        this->num = num;
//    }
//
//    T getNum() {
//        return this->num;
//    }
//};

int main()
{
    /*complexNum obj1(4, 5);
    complexNum obj2;
    
    obj2.setNum(4,5);

    obj1.print();
    obj2.print();

    if (obj1 == obj2) {
        cout << "Both objects are equal" << endl;
    }
    else {
        cout << "objects are not equal" << endl;
    }*/

    /*Number<int> numberInt(7);
    Number<double> numberDouble(7.7);

    cout << "Int Number: " << numberInt.getNum() << endl;
    cout << "Double number: " << numberDouble.getNum() << endl;*/

    /*Derived d1;
    Base* base1 = &d1;

    base1->print();

    Base b1;
    b1.print();*/

    /*Distance d;
    cout << "Distance : " << addFive(d) << endl;*/
    /*Dog dog1;

    cout << "Dog Class:" << endl;
    dog1.info();
    dog1.bark();

    cout << endl;

    Cat cat1;

    cout << "Cat class!" << endl;

    cat1.info();
    cat1.meow();*/

    /*Bat b1;*/

    /*C obj;
    obj.display();*/
    /*Dog dog1;

    dog1.eat();
    dog1.sleep();
    dog1.setColor("Black");

    dog1.bark();
    dog1.setType("Golden");

    dog1.displayInfo();*/


    /*Dog dog1;

    dog1.eat();
    dog1.sleep();
    dog1.bark();*/

    /*int var = 5;
    int* pointVar;

    pointVar = &var;

    *pointVar = 1;

    cout << var << endl;*/

   /* int* ptr;
    int arr[5];

    ptr = arr;*/

    /*
    
            ptr = arr;
            ptr = arr[0]

            ptr + 1 = arr[1]
            ptr + 2 = arr[2]
    
    */

    /*float arr[3];
    float* ptr;

    cout << "Displaying adresses using arrays!" << endl;

    for (int i = 0; i < 3; i++) {
        cout << "&arr[" << i << "]: " << &arr[i] << endl;
    }

    for (int i = 0; i < 3; i++) {
        arr[i] = 0;
        cout << "arr[" << i << "]: " << arr[i] << endl;
    }

    ptr = arr;

    cout << "\nDisplaying adresses using pointers!" << endl;

    for (int i = 0; i < 3; i++) {
        cout << "ptr +" << i << " = " << ptr + i << endl;
    }

    for (int i = 0; i < 3; i++) {
        cout << "*ptr + " << i << " = " << *(ptr + i) << endl;
    }*/

    /*float arr[5];

    cout << "Enter 5 numbers: " << endl;

    for (int i = 0; i < 5; i++) {
        cin >> *(arr + i);
    }
    cout << "Displaying array!" << endl;

    for (int i = 0; i < 5; i++) {
        cout << *(arr + i) << endl;
    }*/

   /* int a = 5, b = 10;
    swap(&a, &b);

    cout << "A: " << a << "\nB: " << b << endl;*/

    /*int* pointvar;

    pointvar = new int;

    *pointvar = 45;*/

    //int* pointVar;

    //pointVar = new int;

    //*pointVar = 5;

    //cout << *pointVar << endl; //5

    //delete pointVar;

    //cout << *pointVar << endl; //Throws Exception!

    //int num;
    //cout << "Enter total number of students: ";
    //cin >> num;

    //float* ptr;

    ////memory allocation
    //ptr = new float[num];

    //cout << "Enter GPA of students!" << endl;

    //for (int i = 0; i < num; i++) {
    //    cout << "Student " << i + 1 << ": ";
    //    cin >> *(ptr + i);
    //}


    //cout << "\nDisplaying GPA of students!" << endl;

    //double sum = 0;
    //for (int i = 0; i < num; i++) {
    //    cout << "Student " << i + 1 << ": " << *(ptr + i) << endl;
    //    sum += *(ptr + i);
    //}

    //cout << "Avg: " << sum / num << endl;
    //delete[] ptr;

    //Student* ptr = new Student();

    //ptr->getAge();

    //delete ptr;

    /*int number;
    cout<<"Number of students: ";
    cin >> number;

    Student* ptr;
    ptr = new Student[number];

    cout << "Enter Information for students!" << endl;
    for (int i = 0; i < number; i++) {
        string name;
        int age;
        double grade;

        cout << "Name: ";        
        cin >> name;

        cout << "Age: ";
        cin >> age;

        cout << "Grade: ";
        cin >> grade;

        (ptr + i)->setInfo(name, age, grade);
    }

    cout << "Displaying Information of Students! " << endl;

    for (int i = 0; i < number; i++) {
        (ptr + i)->printinfo();
    }
    
    delete[] ptr;*/



























}
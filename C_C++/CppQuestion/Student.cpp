#include "Student.h"

Student::Student(string name, int age, int ID, float GPA) {
	this->name = name;
	this->age = age;
	this->ID = ID;
	this->GPA = GPA;
}

string Student::getName() {
	return this->name;
}

int Student::getAge() {
	return this->age;
}

int Student::getID() {
	return this->ID;
}

float Student::getGPA() {
	return this->GPA;
}

void Student::setName(string name) {
	this->name = name;
}

void Student::setAge(int age) {
	this->age = age;
}

void Student::setID(int id) {
	this->ID = id;
}

void Student::setGPA(float gpa) {
	this->GPA = gpa;
}

void Student::printInfo() {
	cout << "Name = " << this->getName() << endl;
	cout << "Age = " << this->getAge() << endl;
	cout << "ID = " << this->getID() << endl;
	cout << "GPA = " << this->getGPA() << endl;
}

string Student::toString() {
	return this->getName() + " " + std::to_string(this->getAge()) + " " + std::to_string(this->getID()) + " " + std::to_string(this->getGPA()) + "\n";
}
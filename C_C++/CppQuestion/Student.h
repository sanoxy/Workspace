#pragma once
#include <iostream>
#include <string>
using namespace std;
class Student
{
private:
	string name;
	int age;
	int ID;
	float GPA;
public:
	Student(string name, int age, int ID, float GPA);

	//Accesor Functions
	string getName();
	int getAge();
	int getID();
	float getGPA();

	void setName(string name);
	void setAge(int age);
	void setID(int id);
	void setGPA(float gpa);

	void printInfo();
	string toString();
};


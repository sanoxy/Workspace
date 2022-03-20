#pragma once
#include <iostream>
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
	string getName();
	int getAge();
	int getID();
	float getGPA();

	void setName(string name);
	void setAge(int age);
	void setID(int id);
	void setGPA(float gpa);

	void printInfo();
};


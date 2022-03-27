#include <iostream>
#include "Student.h"
#include <chrono>
#include <thread>
#include <fstream>
#include <vector>
 
using namespace std;
vector<Student> myStudents;
void menu(string name, int age, int ID, float GPA, Student* s1);

void updateFile() {
    ofstream MyFile("students.txt");
    
    for (int i = 0; i < myStudents.size(); i++) {
        MyFile << myStudents[i].toString();
    }

    MyFile.close();
}

Student* findStudent(int ID) {

    for (int i = 0; i < myStudents.size(); i++) {
        if (myStudents[i].getID() == ID)
            return &myStudents[i];
    }
    return NULL;
}

void deleteStudent(int ID) {
    for (int i = 0; i < myStudents.size(); i++) {
        if (myStudents[i].getID() == ID) {
            myStudents.erase(myStudents.begin() + i);
        }
    }
}

void modifyStudent(string name, int age, int ID, float GPA) {
    for (int i = 0; i < myStudents.size(); i++) {
        if (myStudents[i].getID() == ID) {
            cout << "Name: ";
            cin >> name;

            cout << "Age: ";
            cin >> age;

            cout << "GPA: ";
            cin >> GPA;

            myStudents[i].setName(name);
            myStudents[i].setAge(age);
            myStudents[i].setGPA(GPA);
        }
    }
}
void returnToMenu(string name, int age, int ID, float GPA, Student* s1) {
    cout << endl;
    cout << "Returning to main menu 3..." << endl;
    std::this_thread::sleep_for(std::chrono::milliseconds(1000));
    cout << "Returning to main menu 2..." << endl;
    std::this_thread::sleep_for(std::chrono::milliseconds(1000));
    cout << "Returning to main menu 1..." << endl;
    std::this_thread::sleep_for(std::chrono::milliseconds(1000));
    system("cls");
    menu(name, age, ID, GPA, s1);
}

void menu(string name, int age, int ID, float GPA, Student* s1) {
    int choice;

    cout << "1. Add Student" << endl;
    cout << "2. Show Student" << endl;
    cout << "3. Modify Student" << endl;
    cout << "4. Delete Student" << endl;
    cout << "5. Exit" << endl;

    cout << "Choice: ";
    cin >> choice;

    switch (choice) {
    case 1:
        system("cls");

        cout << "Name: ";
        cin >> name;

        cout << "Age: ";
        cin >> age;

        cout << "ID: ";
        cin >> ID;

        cout << "GPA: ";
        cin >> GPA;

        s1 = new Student(name, age, ID, GPA);
        myStudents.push_back(*s1);
        
        cout << "Student has been added to the vector!" << endl;
        returnToMenu(name, age, ID, GPA,s1);
    case 2:
        system("cls");
        cout << "Enter Student ID: ";
        cin >> ID;
        if (findStudent(ID) != NULL) {
            findStudent(ID)->printInfo();
        }
        else {
            cout << "Student could not be found!" << endl;
            returnToMenu(name, age, ID, GPA, s1);
        }
        
        returnToMenu(name, age, ID, GPA, s1);
    case 3:
        cout << "Enter Student ID: ";
        cin >> ID;
        modifyStudent(name, age, ID, GPA);
        returnToMenu(name, age, ID, GPA, s1);
    case 4:
        system("cls");
        cout << "Enter Student ID: ";
        cin >> ID;
        deleteStudent(ID);
        returnToMenu(name, age, ID, GPA, s1);
    case 5:
        updateFile();
        exit(0);
    default:
        cout << "You made invalid choice!" << endl;
        returnToMenu(name, age, ID, GPA, s1);
    }
}

int main()
{
    std::ifstream infile("students.txt");
    string name;
    int age;
    int ID;
    float GPA;

    Student* s1;

    while (infile >> name >> age >> ID >> GPA)
    {
        s1 = new Student(name,age,ID,GPA);

        myStudents.push_back(*s1);
        delete s1;
    }

    menu(name, age, ID, GPA, s1);
}



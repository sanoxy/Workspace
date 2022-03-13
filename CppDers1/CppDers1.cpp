#include <iostream>
#include <cmath>
#include <vector>
using namespace std;

void greet(string name) {
    cout << "Hello " << name << endl;
}

int add(int var1, int var2) {
    return var1 + var2;
}

int add(int var1, int var2, int var3) {
    return var1 + var2 + var3;
}

int fibo(int number) {
    if (number < 2)
        return 1;
    return fibo(number - 1) + fibo(number - 2);
}

int main()
{
    /*cout << "Hello world!" << endl;
    cout << "My name is Ayberk" << endl;

    int x;

    cin >> x;
    cout << "X: " << x << endl;*/

    /*
        1. Arith
        2. Assignment
        3. Relational
        4. Logical && || !
        5. Bitwise
            &
            |
            ^
            ~
            <<
            >>
        6. other
            sizeof
            Ternary Operatörü!
            string result = (5 > 0) ? "even" : "odd"; // "even"
            &
            .
            ->
            <<
            >>
    
    
    */

    //if (5 > 4)
    //    cout << "true" << endl;
    //else if (6 > 7)
    //    cout << "X" << endl;
    //else
    //    cout << "false" << endl;


    //if (true) {
    //    if (5 > 6) {
    //        if (4 > 3) {

    //        }
    //    }
    //}

    //for (int i = 0; i < 5; i++) {
    //    cout << i << endl;
    //}

    /*int j = 0;
    while (j < 5) {
        cout << j << endl;
        j++;
    }*/

  /*  int j = 0;
    do {
        cout << j << endl;
        j++;
    } while (j < 5);*/

    /*for (int i = 0; i < 10; i++) {
        cout << i << endl;
        if (i == 5)
            break;
    }*/

    //char oper;
    //float num1, num2;
    //cout << "Enter an operator (+, -, *, /): ";
    //cin >> oper;
    //cout << "Enter two numbers: " << endl;
    //cin >> num1 >> num2;

    //switch (oper) {
    //case '+':
    //    cout << num1 << " + " << num2 << " = " << num1 + num2;
    //    break;
    //case '-':
    //    cout << num1 << " - " << num2 << " = " << num1 - num2;
    //    break;
    //case '*':
    //    cout << num1 << " * " << num2 << " = " << num1 * num2;
    //    break;
    //case '/':
    //    cout << num1 << " / " << num2 << " = " << num1 / num2;
    //    break;
    //default:
    //    // operator is doesn't match any case constant (+, -, *, /)
    //    cout << "Error! The operator is not correct";
    //    break;
    //}

    /*
    
    returnType functionName (parameter1, parameter2,...) {
        // function body   
    }
    
    
    */
    
    /*string name = "Erkan";
    string name2 = "Ayberk";

    cout << "Ayberk's size: " << name2.size() << endl;

    greet(name);

    auto var1 = 5;
    auto var2 = 10;

    cout<<"Summation: "<<add(var1,var2)<<endl;
    cout << "Square root of 4: " << sqrt(4) << endl;
    cout << "Summation: " << add(var1, var2, 5) << endl;
    cout << "Fibo(5) = " << fibo(5) << endl;*/

    //int numbers[5] = {7, 5, 6, 12, 35};

    //cout << "The numbers are: ";

    //for (const int &n : numbers) {
    //    cout << n << "  ";              //For each loop 
    //                                    //Extended For
    //}

    //cout << "\nThe numbers are: ";

    //for (int i = 0; i < 5; ++i) {
    //    cout << numbers[i] << "  ";
    //}

  /*  int numbers[5] = { 7, 5, 6, 12, 35 };
    for (int var : numbers) {
        cout << var << endl;
    }

    vector<string> myVektor;
    myVektor.push_back("Ayberk");
    myVektor.push_back("Erkan");
    myVektor.push_back("Ali");

    for (string name : myVektor) {
        cout << name << endl;
    }

    for (int i = 0; i < myVektor.size(); i++) {
        cout << myVektor[i] << endl;
    }*/
   
    
}
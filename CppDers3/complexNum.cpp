#include "complexNum.h"
#include <iostream>

using namespace std;

complexNum::complexNum(int a, int b) {
	this->real = a;
	this->imag = b;
}

void complexNum::setNum(const int a, const int b) {
	this->real = a;
	this->imag = b;
}

void complexNum::print() const {
	cout << "Real: " << this->real << "\nImaginary: " << this->imag << endl;
}

bool complexNum::operator==(const complexNum& obj) {
	if (this->real == obj.real && this->imag == obj.imag)
		return true;
	return false;
}
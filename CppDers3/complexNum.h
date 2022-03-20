#ifndef COMPLEXNUM_H
#define COMPLEXNUM_H

class complexNum {
private:
	int real;
	int imag;

public:
	complexNum(const int a = 0, const int b = 0);
	void setNum(const int a, const int b);
	void print() const;
	bool operator==(const complexNum&);
};
#endif

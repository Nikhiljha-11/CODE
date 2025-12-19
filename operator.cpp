#include <iostream>
using namespace std;

class Complex {
private:
    float real, imag;

public:
    void set(float r, float i) {
        real = r;
        imag = i;
    }

    Complex operator + (Complex c) {
        Complex t;
        t.real = real + c.real;
        t.imag = imag + c.imag;
        return t;
    }

    Complex operator - (Complex c) {
        Complex t;
        t.real = real - c.real;
        t.imag = imag - c.imag;
        return t;
    }

    void display() {
        cout << real << " + " << imag << "i" << endl;
    }
};

int main() {
    Complex c1, c2, sum, diff;

    c1.set(6, 4);
    c2.set(2, 3);

    sum = c1 + c2;
    sum.display();

    diff = c1 - c2;
    diff.display();

    return 0;
}

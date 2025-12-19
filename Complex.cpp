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

    void display() {
        cout << real << " + " << imag << "i" << endl;
    }

    Complex add(Complex c) {
        Complex t;
        t.real = real + c.real;
        t.imag = imag + c.imag;
        return t;
    }

    Complex subtract(Complex c) {
        Complex t;
        t.real = real - c.real;
        t.imag = imag - c.imag;
        return t;
    }

    Complex multiply(Complex c) {
        Complex t;
        t.real = real * c.real - imag * c.imag;
        t.imag = real * c.imag + imag * c.real;
        return t;
    }

    Complex divide(Complex c) {
        Complex t;
        float d = c.real * c.real + c.imag * c.imag;
        t.real = (real * c.real + imag * c.imag) / d;
        t.imag = (imag * c.real - real * c.imag) / d;
        return t;
    }
};

int main() {
    Complex c1, c2, r;

    c1.set(4, 5);
    c2.set(2, 3);

    r = c1.add(c2);
    r.display();

    r = c1.subtract(c2);
    r.display();

    r = c1.multiply(c2);
    r.display();

    r = c1.divide(c2);
    r.display();

    return 0;
}

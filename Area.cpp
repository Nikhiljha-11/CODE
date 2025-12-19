#include <iostream>
using namespace std;

int area(int side) {
    return side * side;
}

int area(int length, int breadth) {
    return length * breadth;
}

float area(float radius) {
    return 3.14f * radius * radius;
}

int main() {
    cout << "Area of Square = " << area(5) << endl;
    cout << "Area of Rectangle = " << area(10, 4) << endl;
    cout << "Area of Circle = " << area(3.5f) << endl;

    return 0;
}

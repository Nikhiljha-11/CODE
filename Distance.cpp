#include <iostream>
using namespace std;

class Distance {
private:
    int feet;
    float inches;

public:
    void setdist(int f, float i) {
        feet = f;
        inches = i;
    }

    void getdist() {
        cout << "Enter feet: ";
        cin >> feet;
        cout << "Enter inches: ";
        cin >> inches;
    }

    void showdist() {
        cout << "Distance = " << feet << " feet " << inches << " inches" << endl;
    }
};

int main() {
    Distance d1, d2;

    d1.setdist(5, 8.5);
    d1.showdist();

    d2.getdist();
    d2.showdist();

    return 0;
}

#include <iostream>
#include <iomanip>
using namespace std;

class Time {
private:
    int hour, minute, second;
    bool isPM;

public:
    Time() {
        hour = 0;
        minute = 0;
        second = 0;
        isPM = false;
    }

    Time(int h, int m, int s, bool pm = false) {
        hour = h;
        minute = m;
        second = s;
        isPM = pm;
    }

    void convertTo12() {
        if (hour >= 12) {
            isPM = true;
            if (hour > 12) hour -= 12;
        } else {
            isPM = false;
            if (hour == 0) hour = 12;
        }
    }

    void convertTo24() {
        if (isPM && hour != 12)
            hour += 12;
        else if (!isPM && hour == 12)
            hour = 0;
    }

    void display() {
        cout << setw(2) << setfill('0') << hour << ":"
             << setw(2) << minute << ":"
             << setw(2) << second
             << (isPM ? " PM" : " AM") << endl;
    }
};

int main() {
    Time t1(17, 30, 0);
    t1.convertTo12();
    t1.display();

    Time t2(10, 15, 0, true);
    t2.convertTo24();
    t2.display();

    return 0;
}

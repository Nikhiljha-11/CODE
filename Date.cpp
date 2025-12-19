#include <iostream>
using namespace std;

class Date {
private:
    int day, month, year;

public:
    Date() {
        day = 1;
        month = 1;
        year = 2001;
    }

    void set_date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    void display_date() {
        cout << "Date: " << day << "/" << month << "/" << year << endl;
    }
};

int main() {
    Date d;

    d.display_date();
    d.set_date(15, 8, 2025);
    d.display_date();

    return 0;
}

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month and Year: ");
        int month = sc.nextInt();
        int year = sc.nextInt();

        String[] monthNames = {"", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[2] = 29;
        }
        int startDay = dayOfWeek(1, month, year);

        System.out.println("\n   " + monthNames[month] + " " + year);
        System.out.println("Mon   Tue   Wed   Thu   Fri   Sat   Sun");

        for (int i = 0; i < startDay; i++) {
            System.out.print("      ");
        }


        for (int i = 1; i <= daysInMonth[month]; i++) {
            System.out.printf("%-6d", i);
            startDay++;
            if (startDay == 7) {
                System.out.println();
                startDay = 0;
            }
        }
        System.out.println();
    }
    public static int dayOfWeek(int d, int m, int y) {
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int K = y % 100;
        int J = y / 100;
        int h = (d + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + (5 * J)) % 7;
        int day = (h + 5) % 7;
        return day;
    }
}

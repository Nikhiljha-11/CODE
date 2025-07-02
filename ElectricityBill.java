import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double billAmount;

        if (units <= 100) {
            billAmount = units * 1.5;
        } else if (units <= 300) {
            billAmount = 100 * 1.5 + (units - 100) * 2.5;
        } else if (units <= 500) {
            billAmount = 100 * 1.5 + 200 * 2.5 + (units - 300) * 4;
        } else {
            billAmount = 100 * 1.5 + 200 * 2.5 + 200 * 4 + (units - 500) * 6;
        }

        double surcharge = billAmount * 0.05; // 5% surcharge
        double totalAmount = billAmount + surcharge;

        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Customer Name: " + name);
        System.out.println("Units Consumed: " + units);
        System.out.println("Bill Amount: Rs " + String.format("%.2f", billAmount));
        System.out.println("Surcharge (5%): Rs " + String.format("%.2f", surcharge));
        System.out.println("Total Amount to Pay: Rs " + String.format("%.2f", totalAmount));
        System.out.println("--- GOVERNMENT OF INDIA ---");
        System.out.println("--- Thank you ----");
    }
}

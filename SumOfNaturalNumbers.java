import java.util.Scanner;

// public class sumofn {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of elements (N): ");
//         int n = scanner.nextInt();

//         int sum = 0;
//         System.out.println("Enter " + n + " numbers:");
//         for (int i = 1; i <= n; i++) {
//             int number = scanner.nextInt();
//             sum += number;
//         }
//         System.out.println("Sum of " + n + " numbers is: " + sum);

//         scanner.close();
//     }
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number (N): ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive natural number.");
        } else {
            int sum = n * (n + 1) / 2;
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }
}




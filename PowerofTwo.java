import java.util.Scanner;
public class PowofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = (n & (n-1)) ==0;
        System.out.println(ans);
    }
}

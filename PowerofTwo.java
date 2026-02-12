import java.util.Scanner;
public class PowofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean ans = (t & (t-1)) ==0;
        System.out.println(ans);
    }
}

import java.util.Scanner;
public class Largenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the three values  to find largest number: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
//        int max = a;
//        if(b>max){
//            max= b;
//        }
//        if(c>max){
//            max= c;
//        }
//        System.out.println("Largest number is : " +max);
        int max= Math.max(c, Math.max(a, b));
        System.out.println( "Largest number = " + max);
    }
}

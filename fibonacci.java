import java.util.Scanner;
public class fibonacci {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n=  sc.nextInt();
        int t1=0 ;  int t2 =1;
        System.out.println("Fibonacci series ");
        for(int i = 1;i<=n;++i){
            System.out.println( t1 +" ");
            int nextTerm = t1 + t2;
            t1= t2;
            t2 = nextTerm;

        }
        sc.close();
    }
}

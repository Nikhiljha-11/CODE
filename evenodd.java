import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        if(isOdd(n)==true){

        
        System.out.println("Number is odd");
        }
        else {
            System.out.println("Number is even");
        }

    }
    private static boolean isOdd(int n){
        return (n & 1)== 1;

    }
    
}

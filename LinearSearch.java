import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,7,8,9,6,5,3,1};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to search: ");
        int item = sc.nextInt();
        int temp =0;
        for(int i = 1 ; i<arr.length;i++)
        {
            if(arr[i]==item)
            {
                System.out.println("Number found in index value of" + i);
                temp = temp+1;
            }
        }
        if(temp == 0)
        {
            System.out.println("Element not found");
        }
    }
}

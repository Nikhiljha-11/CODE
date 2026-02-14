import java.util.Arrays;

public class ALL_zeroEND {
    public static void main(String[] args) {
        int[] arr = {3, 4, 0, 6, 0};
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

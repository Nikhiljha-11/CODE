import java.util.Arrays;
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr ={2,7,4,6,8};
        // bubbleSort(arr);
        // System.out.println(Arrays.toString(arr));
    }
    // static void bubbleSort(int [] arr){
    //     boolean swapped = true;
    //     for(int i= 0 ; i<arr.length;i++){
    //         for (int j = 1;j<arr.length-i; j++){
    //             if(arr[j]< arr[j-1]){
    //                 int temp = arr[j]; //swapping
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //                 swapped =true;


    //             }
    //         }
    //         if(!swapped){
    //             break;
    //         }
    //     }
        
    // }
    static void insertion(int [] arr){
            for(int i = 0; i<arr.length;i++){
                int last = arr.length -i -1;
                int maxIndex = getMaxIndex(arr ,0,last);
            }
    }
    
}

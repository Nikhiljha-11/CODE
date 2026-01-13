public class BinarySearch{
    public static void main(String[] args){
        int [] arr = {2,4,6,8,10,12,14,16,18,20};
        int target = 2;
        System.out.println(Search( arr, target, 0 , arr.length-1));
    }
    static int Search(int[]arr , int target ,  int s , int e){
        
        if(s>e){
            return -1;
        }
        int mid = (s + (e-s)/2);
        if (arr[mid] == target){
            return mid;
        }
        if(target <arr[mid]){
          return Search(arr , target , s , mid-1);
        }
         return Search(arr , target , mid+1 , e);

    }
}

    

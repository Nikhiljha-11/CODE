public class Binary_search {

        public static int findPosition(int[] arr, int k) {
            int left = 0;
            int right = arr.length - 1;
            int result = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == k) {
                    result = mid;      // store answer
                    right = mid - 1;   // search left part
                }
                else if (arr[mid] < k) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }

            return result;
        }

        public static void main(String[] args) {

            int[] arr = {1, 7, 3, 5, 2};
            int k = 2;

            System.out.println(findPosition(arr, k));
        }
    }



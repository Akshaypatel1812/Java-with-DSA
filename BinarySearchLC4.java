public class BinarySearchLC4 {

    static int[] searchRange(int[] arr, int target) {
        int[] ans={-1,-1};

        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);

        return ans;
    }

    static int search(int[] arr, int target, boolean findstartindex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // good practive to write this type of mid index
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans=mid;
                if (findstartindex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 5, 7, 7, 8, 8, 10 };
        int target = 8;

       int []ans= searchRange(a, target);
       System.out.println(ans);
    }
}

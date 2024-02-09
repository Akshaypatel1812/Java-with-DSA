public class LC704 {

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            }

            if (target < nums[mid]) {
                end = mid - 1;
            }

            if (nums[mid] == target) {
                return mid;
            }
          
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 6, 8, 9 };
        System.out.println(search(nums, 4));

    }
}

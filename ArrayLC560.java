public class ArrayLC560 {

    public static int subarraySum(int[] nums, int k) {
        int sum = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            if (sum == k) {
                count++;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0 };

        System.out.println(subarraySum(arr, 0));
    }
}

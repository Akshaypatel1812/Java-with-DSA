import java.util.Arrays;

public class ArrayLC2357 {

    public static int minimumOperations(int[] nums) {
        // Arrays.sort(nums);
        // int small = nums[0];

        // int i = 0;
        // if (small == 0) {

        //     while (nums[i] == 0) {
        //         i++;
        //     }
        //     small = nums[i];
        // }
        int count = 0;

        while (nums[nums.length - 1] != 0) {
            count++;
            Arrays.sort(nums);
            int small = nums[0];
            int i = 0;
            if (small == 0) {

                while (nums[i] == 0) {
                    i++;
                }
                small = nums[i];
            }
            for (int j = i; j < nums.length; j++) {

                if (nums[nums.length - 1] == 0) {
                    return count;
                }
                if (nums[j] == 0) {

                } else {
                   
                    nums[j] = nums[j] - small;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = { 0 };
        System.out.println(minimumOperations(a));
    }
}

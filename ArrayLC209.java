import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLC209 {

    public static int minSubArrayLen(int target, int[] nums) {
        int count = 1;
        Arrays.sort(nums);

        int sum = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            System.out.println(nums[i]);
            if (sum >= target) {
                return count;
            } else {
                sum = sum + nums[i];
                count++;
                if (sum >= target) {
                    return count;
                }
            }
        }

        return 0;
    }

    // public static int minSubArrayLen(int target, int[] nums) {
    //     int count = 1;

    //     int min = Integer.MAX_VALUE;
    //     for (int i = 0; i < nums.length; i++) {
    //         int sum = nums[i];
    //         count = 1;
    //         for (int j = i; j < nums.length; j++) {

    //             if (sum >= target && count < min) {

    //                 min = count;
    //             } else {
    //                 sum = sum + nums[j];
    //                 count++;

    //                 if (sum >= target && count < min) {
    //                     if (count == nums.length - 1) {
    //                         min = count + 1;
    //                     } else {
    //                         min = count;
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     if (min == Integer.MAX_VALUE) {
    //         return 0;
    //     }

    //     return min;
    // }

    public static void main(String[] args) {
        int[] a = { 12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12 };

        System.out.println(minSubArrayLen(213, a));
    }
}

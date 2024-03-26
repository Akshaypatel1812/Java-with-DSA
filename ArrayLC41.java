import java.util.Arrays;

public class ArrayLC41 {
    public static int firstMissingPositive(int[] nums) {
        if ((nums.length == 1 && nums[0] > 1)
                || (nums.length == 1 && nums[0] <= 0)) {
            return 1;
        }

        Arrays.sort(nums);
        int num = 0;
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                num = i;
                break;
            }
        }

        if (nums[num] > 1) {
            return k;
        }

        for (int j = num; j < nums.length; j++) {

            if (nums[j] != k) {

                return k;
            }
            
            if (j < nums.length - 1 && nums[j] < nums[j + 1]) {
                k++;
            }
        }

        return nums[nums.length - 1] + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 1,1000 };

        System.out.println(firstMissingPositive(nums));

    }
}

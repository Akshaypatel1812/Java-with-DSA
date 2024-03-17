import java.util.Arrays;

public class ArrayLC153 {
    public static int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    public static void main(String[] args) {
        int [] nums={4,5,6,7,0,1,2};

        System.out.println(findMin(nums));
    }
}

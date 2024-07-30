import java.util.Arrays;

public class ArrayLC1979 {

    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int s = nums[0];
        int b = nums[nums.length - 1];

        while (s >= 1) {
            int rem = b % s;
            if (rem == 0) {
                return s;
            }
            b = s;
            s = rem;
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] a={12,34,5,2,66};

        System.out.println(findGCD(a));
    }
}

import java.util.HashMap;
import java.util.*;

public class ArrayLC3046 {

    public static boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.containsKey(nums[i])) {
                int val = list.get(nums[i]);
                list.put(nums[i], val + 1);
            } else {
                list.put(nums[i], 1);

            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (list.get(nums[j]) > 2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] a = { 6, 1, 3, 1, 1, 8, 9, 2 };

        System.out.println(isPossibleToSplit(a));
    }
}

import java.util.HashMap;

public class ArrayLC137 {
    public static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> list = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (list.containsKey(nums[i])) {

                int count = list.get(nums[i]);
            
                list.put(nums[i], count + 1);
            } else {
                list.put(nums[i], 1);
            }
        }

        for (int key = 0; key < nums.length; key++) {
            if (list.containsKey(nums[key]) && list.get(nums[key]) == 1) {
                return nums[key];
            }
        }
        

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 1, 0, 1, 99 };

        System.out.println(singleNumber(nums));
    }
}

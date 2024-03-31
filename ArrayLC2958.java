import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayLC2958 {

    // public static int maxSubarrayLength(int[] nums, int k) {
    // HashSet<Integer> list = new HashSet<>();
    // for (int i = 0; i < nums.length; i++) {
    // list.add(nums[i]);
    // }

    // if (k * list.size() < nums.length) {
    // return k * list.size();
    // }

    // return nums.length;
    // }

    public static int maxSubarrayLength(int[] nums, int k) {
        if(k==1){
            HashSet<Integer>Hlist=new HashSet<>();
            for (int j = 0; j < nums.length; j++){
                Hlist.add(nums[j]);
            }

            return Hlist.size();
        }
        int c = 1;
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int j = 1; j < nums.length; j++) {
            if (nums[j - 1] != nums[j]) {
                c = 1;
                
            }
            if (nums[j - 1] == nums[j]) {
                c++;
            }
            if (c <= k) {
                list.add(nums[j]);
            }

        }

        return list.size();
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4,4,3 };

        System.out.println(maxSubarrayLength(nums, 1));
    }
}

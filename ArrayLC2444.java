import java.util.*;

public class ArrayLC2444 {

    public static long countSubarrays(int[] nums, int minK, int maxK) {
        int ans = 0;
        List<List<Integer>> subArrays = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                List<Integer> list = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    list.add(nums[k]);
                }

                subArrays.add(list);
            }
        }

        // for (int a = 0; a < subArrays.size(); a++) {

        // }
        for (List<Integer> subList : subArrays) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int num : subList) {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            if(min==minK && max==maxK){
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1,1,1,1 };
        System.out.println(countSubarrays(nums, 1, 1));
    }
}

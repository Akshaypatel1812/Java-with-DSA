import java.util.Arrays;

public class ArrayLC55 {
    public static boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        if(nums[0]==0 && nums.length!=1){
            return false;
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        if(max>nums.length){
           return true;
        }
        int ans = helper(nums, 0);
        if (ans >= 0) {
            return true;
        }
        return false;
    }

    public static int helper(int[] nums, int count) {
        if (nums.length <= 1) {
            return -1;
        }
        int index = 0;
        int i = 0;
        
        while (i < nums.length) {
            if(nums[index]==0){
                return -1;
            }
         
            i = i + nums[index];
            index = i;
            if (index >= nums.length) {
                return count;
            }
            if (index == nums.length - 1) {
                return count;
            }
            if (nums[index] == 0) {
                break;
            }
        }

        return helper(Arrays.copyOfRange(nums, 1, nums.length), count++);

    }

    // public static boolean canJump(int[] nums) {
    //     int farthest = 0;
        
    //     for (int i = 0; i < nums.length; i++) {
        
    //         if (i > farthest) {
    //             return false;
    //         }
            
    //         farthest = Math.max(farthest, i + nums[i]);
    //     }
        
    //     return true;
    // }

    public static void main(String[] args) {
        int[] a = { 3,0,8,2,0,0,1 };

        System.out.println(canJump(a));

        System.out.println(helper(a, 0));
    }
}

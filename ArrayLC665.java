public class ArrayLC665 {

    public static boolean allSame(int[] nums) {
        if (nums == null || nums.length == 0) {
            return true; // Empty array or null array, all elements are technically the same
        }

        int firstElement = nums[0]; // Choose the first element as the reference
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != firstElement) {
                return false; // If any element is different, return false
            }
        }
        return true; // All elements are the same
    }

    public static boolean isDec(int [] nums){
         for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                return false;
            }
         }

         return true;
    }

    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        if (!allSame(nums)) {
            if (nums.length == 1) {
                return true;
            }
            if (nums[0] == nums[nums.length - 1]) {
                return false;
            }

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    count = count + 1;
                    if (count > 1) {
                        return false;
                    }
                }
            }
            if(isDec(nums) && nums.length>2){
                return false;
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {4,3};

        System.out.println(checkPossibility(nums));

    }
}

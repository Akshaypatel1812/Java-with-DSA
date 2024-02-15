public class Array896 {

    public static boolean isMonotonic(int[] nums) {
        if(nums.length==1){
            return true;
        }
        
        if(nums[0]<nums[nums.length-1]){
            if(!IM(nums)){
                return false; 
            }
        }

        if(nums[0]>nums[nums.length-1]){
            if(!DM(nums)){
                return false;
            }
        }

        if(nums[0]==nums[nums.length-1]){
            if(nums[0]<nums[1]){
                if(!IM(nums)){
                   return false;
                }
            }

            if(nums[0]>nums[1]){
                if(!DM(nums)){
                   return false;
                }
            }
        }

        return true;
    }

    public static boolean IM(int [] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }

        return true;
    }

    public static boolean DM(int [] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int [] nums={3,4,2,3};

        System.out.println(isMonotonic(nums));
    }
}

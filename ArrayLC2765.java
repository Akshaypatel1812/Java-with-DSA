public class ArrayLC2765 {
    public static int alternatingSubarray(int[] nums) {
        int count=2;
        count= helper(nums, count);
        if(count==2 && nums.length>2){
          if(nums[1]-nums[0]!=1){
            return -1;
          }
        }
        return count;
    }

    public static int helper(int[] nums,int count){
        for(int i=0;i<nums.length-2;i++){
            if((nums[i]==nums[i+2])){
                if(nums[i+2]-nums[i]!=0){
                    return count;
                }else{
                count++;
                }
               
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int [] a={64,65,64,65,64,65,66,65,66,65};
        System.out.println(alternatingSubarray(a));
    }
}

import java.util.Arrays;

public class Array268 {
    public static int missingNumber(int[] nums) {
        int max=findMax(nums);
        Arrays.sort(nums);
        for(int i=0;i<=max;i++){
           if(nums[i]!=i){
            return i;
           }
        }

        return max+1;
    }

    public static int findMax(int [] nums){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
           if(nums[i]>max){
            max=nums[i];
           }
        }

        return max;
    }
    public static void main(String[] args) {
        int [] nums={9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(nums));

    }
}

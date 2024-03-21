import java.util.Arrays;

public class ArrayLC410 {

    public static int splitArray(int[] nums, int k) {
        if(k==1){
            int sum=0;
            for(int i=0;i<nums.length;i++){
               sum=sum+nums[i];
            }
            return sum;
        }
        if(nums.length==k){
           Arrays.sort(nums);
           return nums[nums.length-1];
        }
        int ans=0;
        for(int i=0;i<nums.length-(k-1);i++){
            int max=0;
            for(int j=0;j<k;j++){
                max=max+nums[i+j];
            }
            if(max>ans){
                ans=max;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] nums={1,4,4};

        System.out.println(splitArray(nums, 3));
    }

}

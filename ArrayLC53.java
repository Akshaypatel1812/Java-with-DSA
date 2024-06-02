public class ArrayLC53 {

    public static int maxSubArray(int[] nums) {
        int sum=nums[0];
        int max=nums[0];

        for(int i=1;i<nums.length;i++){
            sum= Math.max(nums[i],sum+nums[i]);
            if(sum>max){
                max=sum;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int [] a={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }
}

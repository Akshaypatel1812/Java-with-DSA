public class ArrayLC238 {
    public static int[] productExceptSelf(int[] nums) {
        int [] ans=new int[nums.length];
        int multiply=1;
        for(int i=0;i<nums.length;i++){
            multiply=1;
            for(int j=0;j<nums.length;j++){
               if(i==j){

               }else{
               multiply=multiply*nums[j];
               }
            }
            ans[i]=multiply;
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] nums={1,2,3,4};
        int [] ans=productExceptSelf(nums);
        for(int k=0;k<ans.length;k++){
            System.out.println(ans[k]);
        }

    }
}

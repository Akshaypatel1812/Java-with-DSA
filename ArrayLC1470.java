public class ArrayLC1470 {
    public static int[] shuffle(int[] nums, int n) {
        int [] ans1=new int[n];
        int [] ans2=new int[n];

        int [] ans=new int[n*2];

        for(int i=0;i<n;i++){
            ans1[i]=nums[i];
        }

        for(int i=0;i<n;i++){
            ans2[i]=nums[n+i];
        }

        for(int k=0;k<n*2;k++){
            if(k%2==0){
                ans[k]=ans1[k/2];
            }else{
                ans[k]=ans2[k/2];
            }
        }  
        
        return ans;
    }

     public static void main(String[] args) {
        int [] nums={2,5,1,3,4,7};
        int [] ans=(shuffle(nums, nums.length/2));

        for(int k=0;k<nums.length;k++){
           System.out.println(nums[k]);
        }
    }
}

public class ArrayLC189 {

    public static void rotate(int[] nums, int k) {
        int [] ans=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            ans[(i+k)%nums.length]=nums[i];
        }
        
        for(int j=0;j<nums.length;j++){
            nums[j]=ans[j];
        }

    }
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7};
        rotate(a, 3);
    }
}

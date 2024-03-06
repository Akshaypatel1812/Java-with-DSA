public class Array27 {

    public static int removeElement(int[] nums, int val) {
        int [] ans=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
            
        }

        return count;
    }
    public static void main(String[] args) {
        int [] nums={0,1,2,2,3,0,4,2};
        int val=2;

        System.out.println(removeElement(nums, val));
    }
}

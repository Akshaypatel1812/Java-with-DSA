public class ArrayLC35 {
    public static int searchInsert(int[] nums, int target) {
        int i=0;
        for(;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }

        return i;
    }
    public static void main(String[] args) {
        int [] arr={1,3,5,6};
        System.out.println(searchInsert(arr, 7));
    }
}

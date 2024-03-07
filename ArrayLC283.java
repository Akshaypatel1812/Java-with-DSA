public class ArrayLC283 {

    public static void moveZeroes(int[] nums) {
        int index=0;
        int zeros=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }else{
                 zeros++;
            }
        }

        for(int k=0;k<zeros;k++){
            nums[index]=0;
            index++;

        }

        for(int i=0;i<index;i++){
            System.out.print(nums[i]+",");
        }
    }
    public static void main(String[] args) {
        int [] arr={0,1,0,3,12};

        moveZeroes(arr);

    }
}

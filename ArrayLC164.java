import java.util.Arrays;

public class ArrayLC164 {
    public static int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        int gap=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if((nums[i+1]-nums[i])>gap){
                gap=nums[i+1]-nums[i];
            }
        }

        return gap;
    }

    public static void main(String[] args) {
        int [] nums={10};

        System.out.println(maximumGap(nums));
    }
}

import java.util.Arrays;

public class ArrayLC493 {

    public static int reversePairs(int[] nums) {
        
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
           for(int j=0;j<i;j++){
              if(nums[j]>2*nums[i]){
                count++;
              }
           }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] nums={2,4,3,5,1};

        System.out.println(reversePairs(nums));
    }
}

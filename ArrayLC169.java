import java.util.Arrays;

public class ArrayLC169 {
     public static int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);

        int num=nums[0];
            
        for(int i=0;i<n;i++){
            if(nums[i]==num){
                count++;
            }
            else{
                num=nums[i];
                count=1;
            }

            if(count>n/2){
                return num;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int [] a={2,2,1,1,1,2,2};

        System.out.println(majorityElement(a));
    }
}

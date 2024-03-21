import java.util.Arrays;

public class ArrayLC2344 {

    public static int minOperations(int[] nums, int[] numsDivide) {
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(isdivisible(nums[i], numsDivide)){
                return count;
            }else{
                count++;
            }
        }

        return -1;
    }

    public static boolean isdivisible(int a,int [] numsDivide){
        for(int i=0;i<numsDivide.length;i++){
           if(numsDivide[i]%a!=0){
             return false;
           }
        }

        return true;
    }
    public static void main(String[] args) {
        int [] nums={2,3,2,4,3};
        int [] numsDivide={9,6,9,3,15};

        System.out.println(minOperations(nums, numsDivide));
    }
}

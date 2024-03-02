import java.util.Arrays;

public class Array977 {

    public static int[] sortedSquares(int[] nums) {
        int [] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           ans[i]=nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;


    }
    public static void main(String[] args) {
        int a []={-4,-1,0,3,10};
        int [] ans=sortedSquares(a);
        for(int i=0;i<ans.length;i++){
           System.out.print(ans[i]+",");
        }
    }
}

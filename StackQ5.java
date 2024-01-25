import java.util.ArrayList;
import java.util.Stack;

public class StackQ5 {

    public static int[] nextGreaterElements(int[] nums) {
        int [] ans=new int[nums.length];
        Stack<Integer> s = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!s.empty() && nums[s.peek()]<=nums[i]) {
               s.pop();
            }

            if (s.isEmpty()) {
                ans[i]=-1;
            }
            else{
                ans[i]=nums[s.peek()];
            }

            s.push(i);
        }

        return ans;
    }



    public static void main(String[] args) {
        int[] nums = { 6, 8, 0, 1, 3 };
        int [] ans=nextGreaterElements(nums);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+",");
        }
        System.out.println();
    }
}

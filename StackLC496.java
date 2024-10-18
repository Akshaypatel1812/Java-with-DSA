import java.util.HashMap;
import java.util.Stack;

public class StackLC496 {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans=new int[nums1.length];
        HashMap<Integer,Integer>list=new HashMap<>();
        Stack<Integer>s=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
           while(!s.isEmpty() && nums2[i]>=s.peek()){
             s.pop();
           }

           if(s.isEmpty()){
            list.put(nums2[i], -1);
           }else{
            list.put(nums2[i], s.peek());
           }
           s.push(nums2[i]);
        }

        for(int j=0;j<ans.length;j++){
            ans[j]=list.get(nums1[j]);
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] nums1={4,1,2};
        int [] nums2={1,3,4,2};

        int [] ans=nextGreaterElement(nums1,nums2);

        for(int k=0;k<ans.length;k++){
            System.out.println(ans[k]);
        }
    }
}

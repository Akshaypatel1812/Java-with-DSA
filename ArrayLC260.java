import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayLC260 {
    public static int[] singleNumber(int[] nums) {
        List<Integer> ansList = new ArrayList<>();
        HashMap<Integer, Integer> list = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (list.containsKey(nums[i])) {

                int count = list.get(nums[i]);
            
                list.put(nums[i], count + 1);
            } else {
                list.put(nums[i], 1);
            }
        }
        int count=0;
        for (int key = 0; key < nums.length; key++) {
            if (list.containsKey(nums[key]) && list.get(nums[key]) == 1) {
                ansList.add(nums[key]);
            }
        }

        int [] ans=new int[ansList.size()];
        for(int j=0;j<ans.length;j++){
            ans[j]=ansList.get(j);
        }


        return ans;
        
    }
    public static void main(String[] args) {
        int [] nums={1,2,1,3,2,5};

        int [] ans=singleNumber(nums);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}

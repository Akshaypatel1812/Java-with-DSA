import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class ArrayLC414 {
    public static int thirdMax(int[] nums) {
    

        TreeSet<Integer>list=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
        
            list.add(nums[i]);
        }

        ArrayList<Integer>ans=new ArrayList<>(list);
        
        if(ans.size()<3){
            return ans.get(ans.size()-1);
        }
        return ans.get(ans.size()-3);
    }
    public static void main(String[] args) {
        int [] a={2,4,2,4};

        System.out.println(thirdMax(a));
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class ArrayLC220 {

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
       HashMap<Integer,Integer>list=new HashMap<>();
       for(int i=0;i<nums.length;i++){
         list.put(nums[i], i);
         for(int j=0;j<i;j++){
            if(i!=j && Math.abs(i-j)<=indexDiff && Math.abs(nums[i]-nums[j])<=valueDiff){
                return true;
            }
         }
       }

       System.out.println(list);

       return false;
    }
    public static void main(String[] args) {
        int [] a={1,5,9,1,5,9};

        System.out.println(containsNearbyAlmostDuplicate(a, 2, 3));
    }
}

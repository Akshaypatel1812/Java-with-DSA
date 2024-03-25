import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayLC442 {

     public static List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer>list=new HashSet<>();

        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
               list.add(nums[i]);
            }
        }

        return new ArrayList<>(list);
    }
    public static void main(String[] args) {
        int [] nums={4,3,2,7,8,2,3,1};

        System.out.println(findDuplicates(nums));
    }
}

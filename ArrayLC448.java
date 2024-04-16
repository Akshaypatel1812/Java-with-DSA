import java.util.*;
import java.util.Arrays;

public class ArrayLC448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
    
        for(int i=0;i<nums.length;i++){
           set.add(nums[i]);
        }

        for(int j=1;j<=nums.length;j++){
           if(set.contains(j)){

           }else{
            list.add(j);
           }
        }

        return list;
    }
    public static void main(String[] args) {
        int [] nums={4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(nums));

    }
}

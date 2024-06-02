import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayLC229 {

     public static List<Integer> majorityElement(int[] nums) {
        Set<Integer>list=new HashSet<>();
        int count=0;
        int n=nums.length;
        Arrays.sort(nums);
        int num=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num){
                count++;
            }else{
                num=nums[i];
                count=1;
            }
            if(count>n/3){
                list.add(nums[i]);
            }
        }
        ArrayList<Integer>ans=new ArrayList<>(list);
        return ans;
    }
    public static void main(String[] args) {
        int [] a={1,2,1,1,2,1,7,7,7,7};

        System.out.println(majorityElement(a));

    }
}

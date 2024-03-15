import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayLC2501 {

    public static int longestSquareStreak(int[] nums) {
        HashSet<Integer>list=new HashSet<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]*nums[i])==nums[j]){
                    list.add(nums[i]);
                    list.add(nums[j]);
                }
            }
        }

        if(list.size()==0){
            return -1;
        }

        return list.size();

    }

    // public static int longestSquareStreak(int[] nums) {
    //     int count=1;
        
    //    HashSet<Integer>list=new HashSet<>();
    //    for(int i=0;i<nums.length;i++){
    //     list.add(nums[i]);
    //    }

    //    for(int j=0;j<nums.length;j++){
    //     if(list.contains(nums[j]*nums[j])){
    //       count++;
    //     }
    //    }

    //    if(count==1){
    //     return -1;
    //    }
    //    return count;
    // }

    public static void main(String[] args) {
        int [] nums={4,3,6,16,8,2};

        System.out.println( longestSquareStreak(nums));
    }
}

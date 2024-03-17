import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayLC152 {
    public static int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2 && nums[0]==0){
            return nums[1];
        }
        ArrayList<Integer> list = new ArrayList<>();
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            if (nums[i] == 0) {
                product = 0;
                list.add(0);
            } else {
            
                product = product * nums[i];
                list.add(product);
            }

        }

        product=1;
        for(int i=nums.length-1;i>=0;i--){
            if (nums[i] == 0) {
                product = 1;
                list.add(0);
            } else {
            
                product = product * nums[i];
                list.add(product);
            }
        }

        return Collections.max(list);
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,0};

        System.out.println(maxProduct(nums));

    }
}

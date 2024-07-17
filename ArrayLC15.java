import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayLC15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<Integer> inner = new ArrayList<>();
        List<List<Integer>> outer = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            sum = 0;
            inner = new ArrayList<>();
            for (int j = i; j < i + 3; j++) {
                sum = sum + nums[j];
                inner.add(nums[j]);
            }
            if (sum == 0) {
                outer.add(inner);
            }
        }

        return outer;
    }

    // public static boolean checkSubarraySum(int[] nums, int k) {
    // HashMap<Integer,Integer>list=new HashMap<>();
    // int sum=0;
    // for(int i=0;i<nums.length;i++){
    // list.put(nums[i], sum+nums[i]);
    // sum=sum+nums[i];

    // }
    // int ans=0;
    // for(int i=0;i<nums.length-1;i++){
    // System.out.println(list.get(nums[i]) + " " + list.get(nums[i+1]));
    // ans=list.get(nums[i])+list.get(nums[i+1]);
    // if(ans%k==0){
    // return true;
    // }
    // }

    // return false;
    // }

    public static boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        for (int i = count; i < nums.length-1; i++) {
            sum=0;
            sum = sum + nums[i];
            sum = sum + nums[i + 1];
            

            if (sum % k == 0) {
                return true;
            }
            int m=i+2;
            while(m<nums.length){
                sum=sum+nums[m];
                m++;
                if (sum % k == 0) {
                    return true;
                }
            }
            
            if (i == nums.length - 1) {
                if (count == nums.length - 1) {
                    return false;
                } else {
                    count++;
                    i = count;
                }
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = { 23,2,4,6,7};

        System.out.println(checkSubarraySum(a, 6));
    }
}

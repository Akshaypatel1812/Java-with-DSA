import java.util.*;

public class ArrayLC643 {
    
    public static double findMaxAverage(int[] nums, int k) {
        
        if(nums.length==1 && k==1){
          return nums[0];
        }
        List<Integer>inner=new ArrayList<>();
        List<Double>ans=new ArrayList<>();
        double sum=0;
        for(int i=0;i<nums.length-4;i++){
            sum=0;
            inner=new ArrayList<>();
            for(int j=i;j<nums.length;j++){
                inner.add(nums[j]);
                sum=sum+nums[j];
                if(inner.size()==k){
                  ans.add(sum/k);
                }
            }
        }

        return Collections.max(ans);
    }
    public static void main(String[] args) {
        int [] a={1,12,-5,-6,50,3};

        System.out.println(findMaxAverage(a, 4));
    }
}

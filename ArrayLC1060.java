import java.util.*;
public class ArrayLC1060 {

    public static  ArrayList<Integer> missEle(int [] nums,ArrayList<Integer>list){
        Arrays.sort(nums);
        

        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=nums[i]+1){
                list.add(nums[i]+1);
            }
        }

        return list;
    }
    public static void main(String[] args) {
        int [] nums={1,4,2,5,8,9};
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(missEle(nums,list));

    }
}

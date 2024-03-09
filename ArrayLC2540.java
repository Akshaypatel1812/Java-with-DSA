import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLC2540 {

    public static int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
    //     ArrayList<Integer>list=new ArrayList<>();
    //    for(int i=0;i<nums1.length;i++){
    //     for(int j=0;j<nums2.length;j++){
    //         if(nums1[i]==nums2[j]){
    //            list.add(nums1[i]);
    //            return nums1[i];
    //         }
    //     }
    //    }

    //    return -1;

    ArrayList<Integer>list=new ArrayList<>();

    for(int i=0;i<nums1.length;i++){
        list.add(nums1[i]);
    }

    for(int j=0;j<nums2.length;j++){
        if(list.contains(nums2[j])){
           return nums2[j];
        }
        
    }

    return -1;



        
    }
    public static void main(String[] args) {
        int [] nums1={1,2,3,6};
        int [] nums2={2,3,4,5};

        System.out.println(getCommon(nums1, nums2));
        
    }
}

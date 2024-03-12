import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayLC349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>hashSet=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    hashSet.add(nums1[i]);
                }
            }
        }
        List<Integer> list = new ArrayList<>(hashSet);
        int [] ans=new int[list.size()];
        for(int k=0;k<list.size();k++){
           ans[k]=list.get(k);
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums1={4,9,5};
        int [] nums2={9,4,9,8,4};

        int [] ans=intersection(nums1,nums2);

        for(int k=0;k<ans.length;k++){
            System.out.println(ans[k]);
         }


    }
}

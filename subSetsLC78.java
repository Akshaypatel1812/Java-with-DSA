import java.util.ArrayList;
import java.util.List;

public class subSetsLC78 {
    static List<List<Integer>>outer=new ArrayList<>();
    static List<Integer>inner=new ArrayList<>();
    public static List<List<Integer>> subsets(int[] nums) {
        helper(nums, 0);
        return outer;
    }

    public static void helper(int [] a,int index){
        if(index==a.length){
            outer.add(new ArrayList<>(inner));
            return;
        }

        helper(a,index+1);
        inner.add(a[index]);

        helper(a, index+1);
        
        inner.remove(inner.size()-1);
    }
    public static void main(String[] args) {
        int [] a={1,2,3};

        System.out.println(subsets(a));
    }
}

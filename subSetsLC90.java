import java.util.*;

public class subSetsLC90 {
    static List<List<Integer>> outer = new ArrayList<>();
    static List<Integer> inner = new ArrayList<>();
    static Set<List<Integer>> ans = new HashSet<>();

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        helper(0, nums);
        // for (int i = 0; i < outer.size(); i++) {
        //     ans.add(outer.get(i));
        // }

        List<List<Integer>> list = new ArrayList<>(ans);

        return list;
    }

    public static void helper(int index, int[] a) {
        if (index == a.length) {
            ans.add(new ArrayList<>(inner));
            return;
        }

            inner.add(a[index]);
            helper(index + 1, a);
            while (index + 1 < a.length && a[index] == a[index + 1]) {
                index++;
            }
            inner.remove(inner.size() - 1);
            helper(index + 1, a);
        
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 2 };

        System.out.println(subsetsWithDup(a));
    }
}

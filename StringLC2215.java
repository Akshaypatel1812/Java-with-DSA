import java.util.*;

public class StringLC2215 {

    static ArrayList<Integer> inner = new ArrayList<>();
    static List<List<Integer>> outer = new ArrayList<>();

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        String one = String.valueOf(nums1);
        String two = String.valueOf(nums2);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int j = 0; j < nums1.length; j++) {
            set1.add(nums1[j]);
        }

        for (int j = 0; j < nums2.length; j++) {
            set2.add(nums2[j]);
        }


        for(int num: set1){
            if(!set2.contains(num)){
                inner.add(num);
            }
        }
        outer.add(new ArrayList<>(inner));
        inner.clear();;
        for(int num: set2){
            if(!set1.contains(num)){
                inner.add(num);
            }
        }

        outer.add(inner);
        return outer;
    }

    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3 };
        int[] a2 = { 2,5,6 };

        System.out.println(findDifference(a1, a2));
    }

}

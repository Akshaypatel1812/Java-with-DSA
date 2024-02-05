import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LC26 {

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        // printHashSet(set);

        Integer[] setArray = set.toArray(new Integer[0]);
        for (int i = 0; i < setArray.length; i++) {
            nums[j++] = setArray[i];
        }

        return set.size();
    }

    private static void printHashSet(HashSet<Integer> set) {
        System.out.print("HashSet elements: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 2, 2, 3, 4 };
        System.out.println(removeDuplicates(nums));
    }
}

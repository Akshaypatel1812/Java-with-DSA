import java.util.*;

public class ArrayLC350 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i != nums1.length && j != nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] ans = new int[list.size()];

        for (int k = 0; k < ans.length; k++) {
            ans[k] = list.get(k);
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] a = { 1, 2,2, 3 };
        int[] b = { 2 };

        int[] ans = intersect(a, b);

        for (int j = 0; j < ans.length; j++) {
            System.out.println(ans[j]);
        }
    }
}

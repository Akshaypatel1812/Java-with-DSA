import java.util.ArrayList;

public class ArrayLC2771 {
    public static int maxNonDecreasingLength(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        if (nums1[0] < nums2[0]) {
            list.add(nums1[0]);
        } else {
            list.add(nums2[0]);
        }
        for (int i = 1; i < nums1.length; i++) {
            if ((nums1[i] >= list.get(list.size() - 1)) && (nums2[i] >= list.get(list.size() - 1))) {
                if (nums1[i] < nums2[i]) {
                    list.add(nums1[i]);
                } else {
                    list.add(nums2[i]);
                }
            }

            else if (nums1[i] >= list.get(list.size() - 1)) {
                list.add(nums1[i]);
            } 
            else if(nums2[i] >= list.get(list.size() - 1)) {
                list.add(nums2[i]);
            }
        }
        
        return list.size();
    }

    public static void main(String[] args) {
        int[] nums1 = { 4,2 };
        int[] nums2 = { 10,4 };

        System.out.println(maxNonDecreasingLength(nums1, nums2));

    }
}

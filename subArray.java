import java.util.ArrayList;
import java.util.List;

public class subArray {
    public static List<List<Integer>> findAllSubarrays(int[] arr) {
        List<List<Integer>> subarrays = new ArrayList<>();

        // Iterate over all possible starting indices
        for (int start = 0; start < arr.length; start++) {
            // Iterate over all possible ending indices
            for (int end = start; end < arr.length; end++) {
                // Create a subarray from start to end index
                List<Integer> subarray = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subarray.add(arr[i]);
                }
                // Add the subarray to the list of subarrays
                subarrays.add(subarray);
            }
        }

        return subarrays;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> subarrays = findAllSubarrays(arr);

        // Print all subarrays
        for (List<Integer> subarray : subarrays) {
            System.out.println(subarray);
        }
    }
}

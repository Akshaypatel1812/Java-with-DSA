import java.util.HashMap;

public class ArrayLC136 {

    // public static int singleNumber(int[] nums) {
    // //here we use XOR operator if the value appear two time than it return 0
    // otherwise return 1
    // int xor=0;
    // for(int i=0;i<nums.length;i++){
    // xor=xor^nums[i];
    // }

    // return xor;
    // }
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

        // Count the appearances of each element in the array
        for (int element : nums) {
            if (elementCountMap.containsKey(element)) {
                // If the element is already counted, increment its count
                int count = elementCountMap.get(element);
                elementCountMap.put(element, count + 1);
            } else {
                // If the element is encountered for the first time, set its count to 1
                elementCountMap.put(element, 1);
            }
        }

        // Print the counts of each element
        for (int key : elementCountMap.keySet()) {
            if (elementCountMap.get(key) == 1) {
                // System.out.println("Element with appearance 1: " + key);
                return key; // Return the element and exit the method
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2,8,8 }; // here if any value appears in nums twise than xor==0

        System.out.println(singleNumber(arr));

    }
}

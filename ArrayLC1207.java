import java.util.*;
import java.util.HashMap;

public class ArrayLC1207 {

    public static Map<Integer, Integer> countFrequency(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            if (frequencyMap.containsKey(num)) {
                int currentFrequency = frequencyMap.get(num);
                frequencyMap.put(num, currentFrequency + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        return frequencyMap;
    }
    public static void main(String[] args) {
        int [] a={1,2,2,1,1,3};

    }
}

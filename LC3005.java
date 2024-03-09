import java.util.HashMap;
import java.util.Map;

public class LC3005 {
    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int num : nums) {
            list.put(num, list.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        for (int frequency : list.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }
        int num = 0;
        
        for (int frequency : list.values()) {
            if (frequency== maxFrequency) {
                num++;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 1, 4 };

        System.out.println(maxFrequencyElements(nums));
    }
}

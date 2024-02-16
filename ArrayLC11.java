import java.util.ArrayList;
import java.util.Collections;

public class ArrayLC11 {

    public static int maxArea(int[] height) {
        ArrayList<Integer>list=new ArrayList<>();

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int min=Math.min(height[i], height[j]);
                list.add((min*min)*(j-i));
            }
        }
        System.out.println(list);
        System.out.println(list.size());
        return Collections.max(list);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        System.out.println(maxArea(arr));
    }
}

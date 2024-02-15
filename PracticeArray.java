import java.util.ArrayList;

public class PracticeArray {

    public static void fstHighest(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int fh = 0;
        int sh = 0;
        int th = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > fh) {
                th = sh;
                sh = fh;

                fh = arr[i];

            }
        }

        System.out.println("First Highest is:" + fh + "\nSecond Highest is:" + sh + "\nThird Highest is:" + th);
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 6, 1, 2 };
        fstHighest(nums);
    }
}

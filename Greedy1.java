import java.util.Arrays;
import java.util.Comparator;

public class Greedy1 {

    public static int activitySelection(int start[], int end[], int n) {
        int activities[][] = new int[start.length][3]; // here we need 3 columns and array numbers row
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));
        
        n = 1;
        int lastTime = activities[0][2];
        for (int k = 1; k < start.length; k++) {
            if (activities[k][1] > lastTime) {
                n++;
                lastTime = activities[k][2];
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] start = { 2, 6, 4, 1, 4, 2, 3 };
        int[] end = { 4, 10, 9, 9, 4, 5, 4 };

        System.out.println(activitySelection(start, end, 0));
    }
}

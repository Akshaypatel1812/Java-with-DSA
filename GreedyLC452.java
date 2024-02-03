
import java.util.Arrays;
    import java.util.Comparator;
public class GreedyLC452 {

    
    
    
    
        public static int findMinArrowShots(int[][] points) {
            int n = points.length;
            if (n == 0) {
                return 0;
            }
    
            Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
    
            int arrows = 1;
            int endPos = points[0][1];
    
            for (int i = 1; i < n; i++) {
                if (points[i][0] > endPos) {
                    arrows++;
                    endPos = points[i][1];
                }
            }
    
            return arrows;
        }
    
        public static void main(String[] args) {
            
            int[][] points = { { 2, 4 }, { 6, 10 }, { 4, 9 }, { 1, 9 }, { 4, 4 }, { 2, 5 }, { 3, 4 } };
    
            System.out.println(findMinArrowShots(points));
        }
    }
    



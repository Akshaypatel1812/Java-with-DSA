import java.util.Arrays;
import java.util.Comparator;

public class Greedy1710 {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, Comparator.comparingDouble(o -> o[1]));
        int k = 0;

        for(int i=boxTypes.length-1;i>=0;i--){
            if(truckSize>=boxTypes[i][1]){
                k+=boxTypes[i][0];
                truckSize-=boxTypes[i][1];
            }
            else{
                k += (boxTypes[i][0]*truckSize);
                truckSize=0;
                break;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int[][] points = { { 60, 10 }, { 100, 20 }, { 120, 30 } };
        int truckSize = 50;

        System.out.println(maximumUnits(points, truckSize));
    }
}

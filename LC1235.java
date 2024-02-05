import java.util.Arrays;
import java.util.Comparator;

class LC1235{
    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit)
     {   
        int pro=0;
        int activities[][] = new int[startTime.length][4]; // here we need 3 columns and array numbers row
        for (int i = 0; i < startTime.length; i++) {
            activities[i][0] = i;
            activities[i][1] = startTime[i];
            activities[i][2] = endTime[i];
            activities[i][3]= profit[i];
        }
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));
        
       
        int lastTime = activities[0][2];
        for (int k = 1; k < startTime.length; k++) {
            if (activities[k][1] > lastTime) {
                pro=pro+profit[k];
                lastTime = activities[k][2];
            }
        }

        return pro;
        
    }
    public static void main(String[] args) {
        int [] startTime={1,2,3,3};
        int [] endTime={3,4,5,6};
        int []profit={50,10,40,70};

        System.out.println(jobScheduling(startTime, endTime, profit));
    }
}
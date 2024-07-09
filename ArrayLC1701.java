import java.util.*;

public class ArrayLC1701 {

    public static double averageWaitingTime(int[][] customers) {
        
        List<Integer>list=new ArrayList<>();
        int sum=customers[0][0]+customers[0][1];
        list.add(sum-customers[0][0]);
        for(int i=1;i<customers.length;i++){
           sum=Math.max(sum+customers[i][1], customers[i][0]+customers[i][1]);
           list.add(sum-customers[i][0]);
        }

        double s=0;
        for(int num : list){
           s=s+num;
        }
        
        double d=s/list.size();

        return d;
    }
    public static void main(String[] args) {
        int [][] a={{5,2},{5,4},{10,3},{20,1}};
        System.out.println(averageWaitingTime(a));
    }
}

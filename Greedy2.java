import java.util.Arrays;
import java.util.Comparator;

public class Greedy2 {

    public static int maximumUnits(int [] value,int [] weight,int k,int w){
        k=0;
        double ratio[][]=new double[value.length][2];
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
            // ratio[i][2]=weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        for(int i=value.length-1;i>=0;i--){
            if(w>=weight[i]){
                k+=value[i];
                w-=weight[i];
            }
            else{
                k += (ratio[i][1]*w);
                w=0;
                break;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] value = { 60, 100, 120 };
        int[] weight = { 10, 20, 30 };
        int w=50;

        System.out.println(maximumUnits(value, weight, 0, w));
    }
}
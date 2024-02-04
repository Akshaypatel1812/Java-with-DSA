import java.util.Arrays;
import java.util.Comparator;

public class Greedy3 {
    public static void main(String[] args) {
        int [][] pairs={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingInt(o->o[1]));

        int count=1;
        int lastTime=pairs[0][1];

        for(int i=1;i<pairs.length;i++){

            if(pairs[i][0]>lastTime){
                count++;
                lastTime=pairs[i][1];
            }
        }

        System.out.println(count);

    }
}

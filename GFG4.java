import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GFG4 {

    static List<Integer> minPartition(int N)
    {
        Integer [] coins={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        Arrays.sort(coins,Comparator.reverseOrder());
        ArrayList<Integer>list=new ArrayList<>();
       
        for (int i = coins.length; i >=0; i--) {
            if (coins[i] <= N) {
                while (coins[i] <= N){
                    N = N - coins[i];
                    list.add(coins[i]);
            }
        }
    }

    return list;
        
    }
    public static void main(String[] args) {
        minPartition(1812);
        ArrayList<Integer>ans=new ArrayList<>();
        for(int j=0;j<ans.size();j++){
            System.out.println(ans.get(j)+"");
        }
    }
}

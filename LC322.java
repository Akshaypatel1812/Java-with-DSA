import java.util.Arrays;

public class LC322 {

    public static int coinChange(int[] coins, int amount) {
        if(amount<=0){
            return 0;
        }

        if(coins.length==1 && (coins[0]>amount || coins[0]<amount)){
            return -1;
        }
        Arrays.sort(coins);

        int count = 0;
        for (int i = coins.length-1; i >=0; i--) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount){
                    amount = amount - coins[i];
                    count++;
            }
        }
    }

    

    return count;

    }
    public static void main(String[] args) {
        int[] coins = {2};
        int target = 3;

        System.out.println(coinChange(coins, target));
    }
}

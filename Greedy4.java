import java.util.Arrays;
import java.util.Comparator;

public class Greedy4 {

    public static int minimumAddedCoins(Integer[] coins, int target) {
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= target) {
                while (coins[i] <= target){
                    target = target - coins[i];
                    count++;
            }
        }
    }

    return count;

    }

    public static void main(String[] args) {
        Integer[] coins = { 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int target = 1849;

        System.out.println(minimumAddedCoins(coins, target));
    }
}

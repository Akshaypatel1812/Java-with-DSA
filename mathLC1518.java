public class mathLC1518 {

    public static int numWaterBottles(int numBottles, int numExchange) {
        return helper(numBottles, numExchange, numBottles);
    }
    
    public static int helper(int numBottles, int numExchange,int ans){
        if(numBottles<numExchange){
            return ans;
        }
        int n =numBottles/numExchange;
        ans=ans+n;
        int baaki=numBottles%numExchange;
        
        return helper(n+baaki, numExchange, ans);
    }
    public static void main(String[] args) {
        int numBottles=15;
        int numExchange=4;

        System.out.println(numWaterBottles(numBottles, numExchange));
    }
}

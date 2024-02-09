public class LC279 {
    static int ans=0;
    public static int numSquares(int n) {
        
        if (n <= 0) {
            return ans;
        }
        int a = 0;

        while ((a * a) <= n) { 
            a++;
        }
        
        n = n - ((a-1) * (a-1));
        ans++;
        return numSquares(n);

    }

    public static void main(String[] args) {

        System.out.println(numSquares(12));

    }
}

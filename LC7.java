public class LC7 {
    public static int reverse(int x) {
        int ans = 0;
        if (x < 0) {
            while (x < 0) {
                int rem = x % 10;
                ans = ans * 10 + rem;
                x = x / 10;
            }
            
        } else {
            while (x > 0) {
                int rem = x % 10;
                ans = ans * 10 + rem;
                x = x / 10;
            }
           
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverse(321));
    }
}

public class SumOfNumRecursion {

    static int sum(int num, int count, int ans) {
        if (count > num) {
            return ans;
        }

        ans = ans + count;

        return sum(num, count + 1, ans);
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 1, 0));
    }
}

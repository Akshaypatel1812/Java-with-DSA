public class num263 {
    public static boolean isUgly(int n) {
        if (n <= 0) { // Handle non-positive numbers
            return false;
        }
        if (n == 1) { // Base case: when n becomes 1, return true
            return true;
        }
        if (n % 2 == 0) {
            n = n / 2;
            return isUgly(n);
        }
        if (n % 3 == 0) {
            n = n / 3;
            return isUgly(n);
        }
        if (n % 5 == 0) {
            n = n / 5;
            return isUgly(n);
        }

        return false;

    }

    public static void main(String[] args) {
        int num = 6;

        System.out.println(isUgly(num));
    }
}

public class num258 {

    public static int addDigits(int num) {
        int ans = 0;
        return helper(num, ans);
    }

    public static int helper(int nums, int ans) {
        if (nums < 10) {
            return ans;
        }
        String s = String.valueOf(nums);
        for (int i = 0; i < s.length(); i++) {
            nums += (s.charAt(i) - '0');
            System.out.println(s.charAt(i) - '0');

        }
        return helper(nums, ans + 1); // Increment ans in the recursive call
    }

    // public static int addDigits(int num) {
    // if (num < 10) {
    // return num; // Base case: if num is already a single-digit number, return it
    // }
    // int sum = 0;
    // String s = String.valueOf(num);
    // for (int i = 0; i < s.length(); i++) {
    // sum += s.charAt(i) - '0'; // Add the numeric value of each digit
    // }
    // return addDigits(sum); // Recursively call addDigits with the sum of digits
    // }
    public static void main(String[] args) {
        int a=38;
        System.out.println(addDigits(a));
        String s = String.valueOf(a);
        System.out.println(s);
        
    }
}

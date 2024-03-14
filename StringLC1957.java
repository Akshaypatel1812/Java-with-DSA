public class StringLC1957 {
    public static String makeFancyString(String s) {
        StringBuilder str = new StringBuilder(s);
        int count = 1; // Count of consecutive characters
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++; // Increment count for consecutive characters
                if (count >= 3) {
                    str.deleteCharAt(i); // Remove extra character
                    i--; // Decrement index after removal
                }
            } else {
                count = 1; // Reset count for non-consecutive characters
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s="aaabaaaa";

        System.out.println(makeFancyString(s));
    }
}

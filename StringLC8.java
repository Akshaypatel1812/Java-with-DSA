public class StringLC8 {
    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;
    
        int index = 0;
        int sign = 1;
        long result = 0;
    
        // Skip leading whitespace
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
    
        // Check if optional sign character is present
        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }
    
        // Process digits and convert to integer
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            result = result * 10 + digit;
            
            // Check for overflow
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign == -1 && (-1) * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            
            index++;
        }
    
        // Apply sign
        result *= sign;
    
        return (int) result;
    }
    
    public static void main(String[] args) {
        String str="   -42";

        System.out.println(myAtoi(str));
    }
}

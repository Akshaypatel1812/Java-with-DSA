import java.util.ArrayList;


public class TCS1 {

    public static long ExtractNumber(String S) {
        char[] c = S.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                // If the character is a digit, append it to num
                num.append(c[i]);
                // If the next character is not a digit or it's the end of the string, parse the number and add it to the list
                if (i == c.length - 1 || !Character.isDigit(c[i + 1])) {
                    int val = Integer.parseInt(num.toString());
                    list.add(val);
                    // Reset the StringBuilder for the next number
                    num.setLength(0);
                }
            }
        }
 
        long maxNum = list.get(0);
        
        // Iterate through the ArrayList to find the maximum number
        for (int number : list) {
            if (number > maxNum) {
                maxNum = number;
            }
        }

        
        return maxNum;
    }

    

    public static void main(String[] args) {
        String str = "This is alpha 5057 and 97";

        System.out.println(ExtractNumber(str));
    }
}

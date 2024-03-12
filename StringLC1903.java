import java.util.ArrayList;

public class StringLC1903{

    public static boolean allEvenDigits(String num) {
        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);
            if (!isEven(digit)) {
                return false; // If any digit is odd, return false
            }
        }
        return true; // If all digits are even, return true
    }
    
    private static boolean isEven(char digit) {
        return (digit - '0') % 2 == 0; // Check if the digit is even
    }
    public static String largestOddNumber(String num) {
        if(allEvenDigits(num)){
            return "";
        }
        int a=Integer.parseInt(num);
        if(num.charAt(num.length()-1)=='0'){
            a=a/10;
            String str=String.valueOf(a);
            return str;
        }
        if(a%2==1){
           return num;
        }
        

        StringBuilder sb=new StringBuilder();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
            int oddNum=Character.getNumericValue(c);
            if(oddNum%2==1){
               sb.append(oddNum);
            }
        }

        return sb.toString();

        
    }
    public static void main(String[] args) {
        String s="10133890";
        System.out.println(largestOddNumber(s));
    }
}
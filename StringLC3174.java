public class StringLC3174 {
    public static String clearDigits(String s) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int secondLast=str.length()-1;
                str.deleteCharAt(secondLast);

            } else {
                str.append(s.charAt(i));
            }
        }
        String ans=new String(str); 
        return ans;
    }

    public static void main(String[] args) {
        String s = "cb34";

        System.out.println(clearDigits(s));
    }
}

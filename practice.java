public class practice {
    public static void swapVowel(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            char c = str.charAt(start);
            if (start<end && c != 'a' && c != 'e' && c != 'i' && c != '0' && c != 'u') {
                start++;
            } 

            char d=str.charAt(end);
            if (start<end && d != 'a' && d != 'e' && d != 'i' && d != '0' && d != 'u') {
                end--;
            } 
            char i=str.charAt(start);
            char j=str.charAt(end);
            char temp=i;
            i=j;
            j=temp;
           
        }
    }

    public static void main(String[] args) {
        String s = "patel";

        swapVowel(s);

        

    }
}

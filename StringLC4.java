public class StringLC4 {

    static String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while (start < end) {
            char b = c[start];
            char e = c[end];
            while ((start < end) && ((b != 'a' && b != 'e' && b != 'i' && b != 'o' && b != 'u')&&(b != 'A' && b != 'E' && b != 'I' && b != 'O' && b != 'U'))) {
                start++;
            }

            while ((start < end) && ((e != 'a' && e != 'e' && e != 'i' && e != 'o' && e != 'u')&& (e != 'A' && e != 'E' && e != 'I' && e != 'O' && e != 'U'))) {
                end--;
            }

            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }

        String n = new String(c);
        return n;

    }

    public static void main(String[] args) {
        String s ="hellO";
        System.out.println(reverseVowels(s));

    }
}

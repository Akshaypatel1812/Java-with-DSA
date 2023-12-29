//here we count num of vowels and consonants in String
public class StringIQ_1 {
    public static void main(String[] args) {
        String str = "Akshay Patel";
        int vowel = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                vowel++;
            } else {
                consonants++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonants);
    }
}

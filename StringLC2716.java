import java.util.HashSet;

class StringLC2716 {

    public static int minimizedStringLength3(String s) {
        HashSet<Character> set =  new HashSet<>();
        for (int i = 0; i <= s.length() - 1; i++) {
            if ((i + 1) <= s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                set.add(s.charAt(i));
                while ((i + 1) <= s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                    i = i + 1;
                }
            }

            else {
                set.add(s.charAt(i));
            }

        }

        return set.size();
    }
    

    // public static int minimizedStringLength2(String s) {
    //     int count = 1; // Initialize count to 1 since the first character is always considered
    
    //     for (int i = 0; i < s.length() - 1; i++) {
    //         if (s.charAt(i) != s.charAt(i + 1)) {
    //             count++;
    //         }
    //     }
    
    //     return count;
    // }

    public static int minimizedStringLength(String s) {
        // int start=0;
        // int end=s.length()-1;
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if ((i + 1) <= s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                while ((i + 1) <= s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                    i = i + 1;
                }
            }

            else {
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        String str = "ipi";

        System.out.println(minimizedStringLength(str));

        // System.out.println(minimizedStringLength2(str));

        System.out.println(minimizedStringLength3(str));
    }
}
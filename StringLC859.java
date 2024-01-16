public class StringLC859 {
    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if(s.equals(goal)){
            for (int i = 0; i < s.length()-1; i++){
                if(s.charAt(i)!=s.charAt(i+1)){
                    return false;
                }
            }
            return true;
        }
        int diff = 0;
        String sttr=s+s;
        // System.out.println(sttr);
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if(sttr.contains(goal)){
                    return true;
                }
                if (diff == 2) {
                    return false;
                }
                diff++;
                char temp = c[i];
                c[i] = c[i+1];
                c[i+1] = temp;
            }
        }

        String ans = String.valueOf(c);
        // System.out.println(ans);

        if (ans.equals(goal)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "ab";
        String goal = "ab";
        System.out.println(buddyStrings(s, goal));
    }
}

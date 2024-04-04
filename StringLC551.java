public class StringLC551 {

    public static boolean checkRecord(String s) {
        if (s.contains("LLL")) {
            return false;
        }
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a++;
                if (a == 2) {
                    return false;
                }
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String s = "PPALLL";

        System.out.println(checkRecord(s));

    }
}

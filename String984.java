public class String984 {

    public static void strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();

        while (a > 0) {
            sb.append('a');
            a--;
        }
        while (b > 0) {
            sb.append('b');
            b--;
        }

        String s = sb.toString();
        if (s.contains("aaa")) {
            int indexforA = 2;
            while (indexforA < s.length()) {
                s.replace(s.charAt(indexforA), s.charAt(s.length()-1));
                indexforA = indexforA + 3;
            }

        }

        System.out.println(s);
    }

    

    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        strWithout3a3b(a, b);
    }
}

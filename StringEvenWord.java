public class StringEvenWord {

    static void printEvenWord(String s) {
        for (String s1 : s.split(" ")) {
            if (s1.length() % 2 == 0) {
                System.out.println(s1);
            }
        }

    }

    public static void main(String[] args) {
        String str = "akshay kiritbhai patel";

        printEvenWord(str);

    }
}

public class StringLC43 {
    public static String multiply(String num1, String num2) {
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);

        int n3=n1*n2;

        String ans=String.valueOf(n3);

        return ans;
    }
    public static void main(String[] args) {
        String s1="123";
        String s2="456";

        System.out.println(multiply(s1,s2));

    }
}

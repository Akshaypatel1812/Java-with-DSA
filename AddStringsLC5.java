public class AddStringsLC5 {
    public static String addStrings(String num1, String num2){
        // char [] a=num1.toCharArray();
        // char [] b=num1.toCharArray();

        long a=Long.parseLong(num1);
        long b=Long.parseLong(num2);
        long c=a+b;

        String str1 = String.valueOf(c);

        return str1;
        
    }
    public static void main(String[] args) {
        String n1="11";
        String n2="123";
        
        System.out.println(addStrings(n1,n2));
    }
}

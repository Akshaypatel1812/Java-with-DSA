public class AddStrings {
    public static String addStrings(String num1, String num2){
        // char [] a=num1.toCharArray();
        // char [] b=num1.toCharArray();

        int a=Integer.parseInt(num1);
        int b=Integer.parseInt(num2);
        int c=a+b;

        String str1 = String.valueOf(c);

        return str1;
        
    }
    public static void main(String[] args) {
        String n1="11";
        String n2="123";
        
        System.out.println(addStrings(n1,n2));
    }
}

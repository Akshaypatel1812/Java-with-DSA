//here we swap two numbers with out use of third integer

public class SwapTwoNum {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        b=b+a;  //30
        a=b-a;  //20
        b=b-a;  //10

        System.out.println("after swap the value of b & a is: " + a + " & " + b);
    }
}

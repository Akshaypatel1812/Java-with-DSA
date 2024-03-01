import java.util.ArrayList;

public class num264 {
    public static int nthUglyNumber(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        int i=1;
        while(list.size()!=n){
           boolean ans=helper(i);
           if(ans==true){
             list.add(i);
             
           }
           i++;
        }

        return list.get(n-1);

    }

    public static boolean helper(int n){
        if (n <= 0) { // Handle non-positive numbers
            return false;
        }
        if (n == 1) { // Base case: when n becomes 1, return true
            return true;
        }
        if (n % 2 == 0) {
            n = n / 2;
            return helper(n);
        }
        if (n % 3 == 0) {
            n = n / 3;
            return helper(n);
        }
        if (n % 5 == 0) {
            n = n / 5;
            return helper(n);
        }

        return false;
    }


    public static void main(String[] args) {
        int num=10;

        System.out.println(nthUglyNumber(num));

    }


}

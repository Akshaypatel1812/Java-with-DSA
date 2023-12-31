public class FactorialRecursion {
    static int factorial(int n){
       if(n<=1){
        return 1;
       }
       else{
         int m=n*factorial(n-1);
         return m;
       }
      
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}

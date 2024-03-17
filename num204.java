public class num204 {
    public static int countPrimes(int n) {
        int count=0;
        for(int i=0;i<n;i++){
            if(isprime(i)){
               count++;
            }
        }

        return count;
    }

    public static boolean isprime(int num){
        if (num <= 1) {
            return false;
        }

        if(num==2){
            return true;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=1;

        System.out.println(countPrimes(n));

        System.out.println(isprime(17));


    }
}

// this program not work with 00000... value this is only to understand recursion concept batter

public class OccuranceOfZeroRecursion {
static int count =0;
    static int zeroCount(int num){
        if(num==0){
            return count;
        }
        if(num%10==0){
            count=count+1;
        }

        return zeroCount(num/10);
    }
    public static void main(String[] args) {
        System.out.println(zeroCount(12340));
    }
}

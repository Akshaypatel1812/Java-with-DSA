public class StringLC1404 {
    public static int binaryToDec(String s){
        return Integer.parseInt(s,2);
    }

    public static int numSteps(String s) {
        int num=binaryToDec(s);
        int step=0;
        step=helper(num,step);

        return step;
    }

    public static int helper(int num,int step){
        if(num==1){
            return step;
        }
         if(num%2==1){
            num=num+1;
         }else{
            num=num/2;
         }
         step=step+1;
        return helper(num, step);

    }
    public static void main(String[] args) {
        String s="1101";
        System.out.println(numSteps(s));
    }
}

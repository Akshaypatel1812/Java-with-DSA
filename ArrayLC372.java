public class ArrayLC372 {
    public static int superPow(int a, int[] b) {
        if(a==1){
            return 1;
        }
        StringBuilder s=new StringBuilder();
        for(int i=0;i<b.length;i++){
            s.append(b[i]);
        }
        String str=new String(s);
        int pow=Integer.valueOf(str);
        double result=Math.pow(a, pow);
        return (int) result;  
    }
    public static void main(String[] args) {
        int a=2147483647;
        int [] b={2,0,0};

       System.out.println( superPow(a, b));
    }
}

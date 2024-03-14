public class num2485 {
    public static int pivotInteger(int n) {
        int sum=0;
        
        for(int i=1;i<=n;i++){
            int sum2=0;
           sum=sum+i;
           for(int j=i;j<=n;j++){
              sum2=sum2+j;
           }
          
           if(sum==sum2){
            return i;
           }
        }

        return -1;

        
    }
    public static void main(String[] args) {
        int num=1;
        System.out.println(pivotInteger(num));
    }
}

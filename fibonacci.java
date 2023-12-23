public class fibonacci{

     static void fibo(int num){
         int n1=0;
         int n2=1;
         int n3;
         int i=0;
         System.out.println(n1);
            System.out.println(n2);
         while(i<=num){
            n3=n2+n1;
            n1=n2;
            n2=n3;
            i++;
           
            System.out.println(n3);

         }
     }
     public static void main(String[] args) {
        fibo(30);
     }
}
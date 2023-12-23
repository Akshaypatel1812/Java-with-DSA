public class linearSearchLC1 {

    static int numOfEvennumOfdigits(int [] arr){
        int num=0;
        for(int nums:arr){
            if(even(nums)){
                num++;
                  
            }
            
        }
        return num;
    }

    static boolean even(int num){
         int numberOfDigits=digit(num);

         if(numberOfDigits%2==0){
            return true;
         }

         return false;
    }

    static int digit(int num){
        int count=0;

        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr={12,345,2,6,7896,1812};
        System.out.println(numOfEvennumOfdigits(arr));
    }
}

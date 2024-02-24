import java.util.Arrays;

public class ArrayLC66 {

    public static int[] plusOne(int[] digits) {
        String str=helper(digits);
        int num=Integer.parseInt(str);
        num=num+1;
        System.out.println(num);
        String ans=String.valueOf(num);
    
        int [] a=new int[ans.length()];
        for(int i=0;i<ans.length();i++){
            a[i] = ans.charAt(i) - '0';
           
        }

        return a;
    }

    public static String helper(int [] digits){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<digits.length;i++){
            str.append(digits[i]);
        }
        return str.toString();
    }
    public static void main(String[] args) {
        int [] nums={1,2,3,4};

        
        int [] ans=plusOne(nums);
        for(int i=0;i<ans.length;i++){
           System.out.print(ans[i]+",");
        }
        
    }
}

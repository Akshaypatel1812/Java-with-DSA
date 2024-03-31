public class StringLC2710 {

    public static String removeTrailingZeros(String num) {
        StringBuilder ans=new StringBuilder(num);
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='0'){
              ans.deleteCharAt(i);
            }
            if(num.charAt(i)!='0'){
                break;
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String num="123";

        System.out.println(removeTrailingZeros(num));
    }
}

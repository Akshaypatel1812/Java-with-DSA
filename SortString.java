import java.util.Arrays;

public class SortString {

    static String SortString(String s){
        char [] c=s.toCharArray();

       Arrays.sort(c);

       String ans=Arrays.toString(c);
       return ans;
    }
    public static void main(String[] args) {
        String str="akshay";

       System.out.println(SortString(str));

    }
}

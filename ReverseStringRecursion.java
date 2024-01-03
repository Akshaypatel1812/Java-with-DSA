import java.util.Arrays;

public class ReverseStringRecursion {

    static char[] reverse(char [] s,int start,int end){
        
        if(start>=end){
            return s;
        }

        if(start<end){

            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;   
        }

        return reverse(s, start+1, end-1);
    }
    public static void main(String[] args) {
        String str="akshay";
        char [] c=str.toCharArray();
        
        String ans=Arrays.toString(reverse(c, 0, c.length-1));
        System.out.println(ans);    
    } 
}

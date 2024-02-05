import java.util.ArrayList;

public class FirstLastOccurance {

    static int FLOFI(String s,int start,char c){
        if(start==s.length()){
            return -1;
        }
        if(s.charAt(start)==c){
            return start;
        }

        return FLOFI(s,start+1,c);
    }

     static int FLOEI(String s,int end,char c){
        if(end==-1){
            return -1;
        }
        if(s.charAt(end)==c){
            return end;
        }

        return FLOFI(s,end-1,c);
    }

    
    public static void main(String[] args) {
        String str="abaacdaefaah";

        int firstIndex=FLOFI(str,0,'a');
        int endIndex=FLOEI(str,str.length()-1,'a');
        System.out.println("First Ocuurance of element is:"+firstIndex+" & Last Occurance of element is:"+endIndex);
        
    }
}

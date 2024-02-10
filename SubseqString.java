import java.util.ArrayList;

public class SubseqString {

    static ArrayList<String> subseq(String s,String ans,ArrayList<String>list){
        if(s.isEmpty()){
            list.add(ans);
            return list;
        }

        char c=s.charAt(0);
        subseq(s.substring(1), ans,list);
        subseq(s.substring(1), ans+c,list);


        return list;
    }
    public static void main(String[] args) {
        String s="123";
        String ans="";
        ArrayList<String>list=new ArrayList<>();
        System.out.println(subseq(s, ans,list));
    }
}

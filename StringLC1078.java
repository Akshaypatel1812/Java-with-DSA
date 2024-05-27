import java.util.ArrayList;

public class StringLC1078 {

    public static String[] findOcurrences(String text, String first, String second) {
        String [] sp=text.split(" ");
        ArrayList<String>list=new ArrayList<>();

        for(int i=0;i<sp.length-2;i++){
            
            if((sp[i].equals(first)) && (sp[i+1].equals(second)) && (i<text.length()-2)){
               list.add(sp[i+2]); 
            }
        }

        String [] ans=list.toArray(new String[0]);
        return ans;
    }
    public static void main(String[] args) {
        String s="jkypmsxd jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa kcyxdfnoa jkypmsxd kcyxdfnoa";
        String first="kcyxdfnoa";
        String second="jkypmsxd";  

        String [] ans=findOcurrences(s, first, second);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}

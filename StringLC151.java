import java.util.ArrayList;
import java.util.Arrays;

public class StringLC151 {
    public static String reverseWords(String s) {
        
        String[] words = s.split("\\s+");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(words));
        

        int start=0;
        int end=wordList.size()-1;

        while(start<end){
            String temp=wordList.get(start);
            wordList.set(start, wordList.get(end));  //beacuse it is array list
            wordList.set(end, temp);
            start++;
            end--;
        }

        String ans=new String();
        for(int i=0;i<wordList.size();i++){
            ans=ans+wordList.get(i)+" ";
        }
        ans=ans.trim();
        
        return ans;
    }
    public static void main(String[] args) {
        String s = "    Hello   World  ";
        s = s.trim();
        s = s.replaceAll("\\s+", " ");

        System.out.println(reverseWords(s));
    }
}

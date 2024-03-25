import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringLC1408 {
     public static List<String> stringMatching(String[] words) {
        HashSet<String>list=new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i==j){

                }else{
                    if(words[i].contains(words[j])){
                        list.add(words[j]);
                    }
                }
            }
        }
        
        
        return new ArrayList<>(list);
        
    }
    public static void main(String[] args) {
        String [] s={"leetcoder","leetcode","od","hamlet","am"};

        System.out.println(stringMatching(s));
    }
}

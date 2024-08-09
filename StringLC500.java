import java.util.ArrayList;

public class StringLC500 {

    public static String[] findWords(String[] words) {
        String a="qwertyuiop";
        String b="asdfghjkl";
        String c="zxcvbnm";
        
        
        ArrayList<String>list=new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            boolean flag=true;
            String check=words[i].toLowerCase();
            if(a.indexOf(check.charAt(0))>=0){
                for(int j=0;j<check.length();j++){
                    if(a.indexOf(check.charAt(j))<0){
                        flag=false;
                        break;
                    }
                }
                
                if(flag){
                  list.add(words[i]);
                }
                
            }
            else if(b.indexOf(check.charAt(0))>=0){
                for(int j=0;j<check.length();j++){
                    if(b.indexOf(check.charAt(j))<0){
                       flag=false;
                       break;
                    }
                }

                 if(flag){
                   list.add(words[i]);
                }
            }else{
                for(int j=0;j<check.length();j++){
                    if(c.indexOf(check.charAt(j))<0){
                       flag=false;
                       break;
                    }
                }

                if(flag){
                    list.add(words[i]);   
                }
            }
        }

        String [] ans=new String[list.size()];

        for(int k=0;k<list.size();k++){
            ans[k]=list.get(k);
        }
 
        return ans;
    }
    public static void main(String[] args) {
        String [] s={"adsdf","sfd"};

        String [] ans=findWords(s);

        for(int i=0;i<ans.length;i++){
            System.out.println(ans);
        }
    }
}

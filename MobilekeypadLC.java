import java.util.ArrayList;

public class MobilekeypadLC {

    static String [] keypad={" ","","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> printNum(String s,String ans){
         if(s.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
         }
         ArrayList<String> list=new ArrayList<>();
         char currchar = s.charAt(0);
         String map=keypad[currchar-'0'];
         for(int i=0;i<map.length();i++){
            list.addAll(printNum(s.substring(1), ans+map.charAt(i)));
         }
         return list;
    }
    public static void main(String[] args) {
        String str="23";

        System.out.println(printNum(str, ""));
    }


}

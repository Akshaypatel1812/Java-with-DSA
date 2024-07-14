import java.util.HashMap;

public class StringLC2283 {
    public static boolean digitCount(String num) {
        int number = Integer.parseInt(num);
        System.out.println(number);
        HashMap<Character,Integer>list=new HashMap<>();
        for(int i=0;i<num.length();i++){
           if(list.containsKey(num.charAt(i))){
            int val=list.get(num.charAt(i));
            list.put(num.charAt(i),val+1);
           }else{
            list.put(num.charAt(i),1);
           }
        }
        System.out.println(list);
        
        for(int i=0;i<list.size();i++){
            if(list.get(i)!=num.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String num="1210";
        System.out.println(digitCount(num));
    }
}

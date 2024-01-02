public class StringRotate {

    static boolean check(String s,String goal){
        if(s.length()!=goal.length()){
            return false;
        }

        String str=s+s;
        if(str.contains(goal)){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String s="abcde";
        String goal="cdeab";

        System.out.println(check(s,goal));
    }
}

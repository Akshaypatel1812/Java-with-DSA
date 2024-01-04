public class StringMoveXEnd {

    static String moveX(String s,int count,String ans){
        if(s.isEmpty()){
            for(int i=0;i<count;i++){
                ans=ans+'x';
            }
            return ans;
        }
        char ch=s.charAt(0);
        if(ch=='x'){
            count++;
            return moveX(s.substring(1), count, ans);
           
        }

        else{
            return moveX(s.substring(1), count, ans+ch);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        String ans="";

        System.out.println(moveX(str, 0, ans));

    }
}

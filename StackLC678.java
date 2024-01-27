import java.util.*;
class StackLC678{
   
    public static boolean checkValidString(String s) {
        Stack<Character> list1=new Stack<>();
        Stack<Character> list2=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                list1.push(c);
            }
           
            if (c==')') {
                list2.push(c);
            }
            
        }

        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if (ch=='*') {
                if(list1.size()<list2.size()){
                    list1.push(ch);
                } 
                if(list1.size()>list2.size()){
                    list2.push(ch);
                }
            }
        }
        
        
        
        if(list1.size()==list2.size()){
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        String str="(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        System.out.println(checkValidString(str));
    }
}
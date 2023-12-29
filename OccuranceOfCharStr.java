public class OccuranceOfCharStr {
    public static void main(String[] args) {
        String str="akshay patel";
        int count=0;
        char c='p';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
               count++;
            }
        }

        System.out.println("Occurance of "+c+" in "+str+" is:"+count);
    }
}

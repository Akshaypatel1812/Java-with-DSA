public class StringLC2108 {
    public static String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }

        return "";
    }

    public static boolean isPalindrome(String check){
        String reverse=reverse(check);
        if(check.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }

    public static String reverse(String s){
        char [] c=s.toCharArray();
        int start=0;
        int end=c.length-1;
        while(start<end){
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;
            end--;
        }

        return new String(c);

    }

    public static void main(String[] args) {
        String [] arr={"notapalindrome","racecar"};

        System.out.println(firstPalindrome(arr));
    }
}

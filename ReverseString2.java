public class ReverseString2 {

    static String reverse(String s,int k){
        int start=0;
        int end=k;
        char [] c=s.toCharArray();
        while(start<end){
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;

            start++;
            end--;
        }

        String ans=new String(c);
        return ans;
    }
    public static void main(String[] args) {
        String str="akshay";

        System.out.println(reverse(str, 2));

    }
}

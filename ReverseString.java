public class ReverseString {

    

    static void reverse(char [] c){
        int start=0;
        int end=c.length-1;
        while(start<end){
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        String str="Akshay";

        char [] charArray=str.toCharArray();
        for(int i=0;i<str.length();i++){
        System.out.println(charArray[i]);
        }
        reverse(charArray);
        System.out.print("Array after reverse:");
        for(int i=0;i<str.length();i++){
        System.out.print(charArray[i]);
        }
    }

}

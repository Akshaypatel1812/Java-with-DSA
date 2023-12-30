public class PrintAtoZ {
    public static void main(String[] args) {
        // System.out.println((char)('a'+3));

        // System.out.println("a"+1);  //if any one variable is in character then answer is in String
        // System.out.println('a'+1);  

        for(int i=97;i<=122;i++){
            System.out.println((char)(i)+",");
        }
        
        System.out.println("Another way:");
        for(int j=0;j<=26;j++){
            System.out.print((char)('a'+j)+",");
        }
    }
}

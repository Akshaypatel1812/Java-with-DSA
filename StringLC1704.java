public class StringLC1704 {

    public static boolean halvesAreAlike(String s) {
        String first=s.substring(0, s.length()/2);
        String second=s.substring(s.length()/2, s.length());

        int f=0;
        int g=0;

        for(int i=0;i<first.length();i++){
            char c=first.charAt(i);
            char d=second.charAt(i);
            if((c=='a' || c=='e' || c=='i' || c=='o' || c=='u') || (c=='A' || c=='E' || c=='I' || c=='O' || c=='U') ){
               f++;
            }

            if((d=='a' || d=='e' || d=='i' || d=='o' || d=='u') || (d=='A' || d=='E' || d=='I' || d=='O' || d=='U') ){
                g++;
             }

        }

        if(f==g){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String s="textbook";

        System.out.println(halvesAreAlike(s));
    }
}

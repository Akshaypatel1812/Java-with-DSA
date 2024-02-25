public class impString {
    public static void main(String[] args) {
        String s="      Hello     World    ";
        // System.out.println(s.length());
        // s=s.trim();
        // System.out.println(s.length());
  
        s=s.replaceAll("\\s+", " ");  //here it replaces all white space with " "
        System.out.println(s.length());
     }
}

public class StringLC1768 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder str=new StringBuilder();
        int i=0;
        int j=0;
        int k=0;

        while(i<word1.length() && j<word2.length()){
             str.append(word1.charAt(i));
             str.append(word2.charAt(j));
             i++;
             j++;
             k++;
             k++;
        }

        if(k<(word1.length()+word2.length())){
            while(i<word1.length()){
                str.append(word1.charAt(i));
                i++;
                k++;
            }

            while(j<word2.length()){
                str.append(word2.charAt(j));
                j++;
                k++;
            }
        }

        return str.toString();
    }
    public static void main(String[] args) {
        String s1="ab";
        String s2="pqrs";

        System.out.println(mergeAlternately(s1,s2));
    }
}

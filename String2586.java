public class String2586 {

    public static int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
           char s= words[i].charAt(0);
           char l=words[i].charAt(words[i].length()-1);
           if((s=='a' || s=='e' || s=='i' || s=='o' || s=='u') && (l=='a' || l=='e' || l=='i' || l=='o' || l=='u')){
            count++;
           }
        }

        return count;
    }
    public static void main(String[] args) {
        String [] s={"hey","aeo","mu","ooo","artro"};

        System.out.println(vowelStrings(s, 1, 4));

    }
}

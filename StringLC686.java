public class StringLC686 {

    // public static int repeatedStringMatch(String a, String b) {
        

    //     if(areTotallyDifferent(a, b)){
    //         return -1;
    //     }
    //     int count=1;
    //     count=helper(a, b, 1,a);
    //     return count;
    // }

    // public static boolean areTotallyDifferent(String a, String b) {
    //     for (char c : a.toCharArray()) {
    //         if (b.indexOf(c) != -1) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static int helper(String a,String b,int count,String a2){
    //     if(a.length()>(a.length()*b.length())){
    //         return -1;
    //     }
    //     if(a.contains(b)){
            
    //         return count;
    //     }
        
    //     count=count+1;
    //     a=a+a2;
        
    //     return helper(a, b,count,a2);  
    // }

    public static int repeatedStringMatch(String a, String b) {
        int count = 1;
        String repeatedA = a;
        while (repeatedA.length() < b.length()) {
            repeatedA += a;
            count++;
        }
        if (repeatedA.contains(b)) {
            return count;
        }
        repeatedA += a; // One more repetition to check if b is substring after one more repetition
        count++;
        if (repeatedA.contains(b)) {
            return count;
        }
        return -1; // b cannot be substring of any repetition of a
    }
    
    public static void main(String[] args) {
        String a="aaaaaaaaaaaaaaaaaaaaaab";
        String b="ba";

        System.out.println(repeatedStringMatch(a, b));
    }
}

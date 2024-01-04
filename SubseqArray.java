import java.util.ArrayList;

public class SubseqArray {
    static ArrayList<String> subseq(int[] num, String ans,int index, ArrayList<String> list) {
        if (index==num.length) {
            list.add(ans);
            return list;
        }
        int c=num[index];
        subseq(num, ans,index+1, list);
        
        subseq(num, ans+c,index+1, list);

        return list;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        String ans ="";
        ArrayList<String> list = new ArrayList<>();
        System.out.println(subseq(a, ans,0, list));
    }
}

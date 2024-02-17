public class ArrayLC2433 {

    public static int[] findArray(int[] pref) {
        int [] ans=new int[pref.length];
        ans[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            ans[i]=pref[i-1]^pref[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] pref={13};
        int [] ans=findArray(pref);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}

public class StringLC443 {
    public static int compress(char[] chars) {
        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<chars.length;i++){
            count=1;
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                 count++;
                 i++;
            }
            if(count==1){
               sb.append(chars[i]);
            }else{
                sb.append(chars[i]);
                sb.append(count);
            }
        }
        System.out.println(sb);
        return sb.toString().length();
    }
    public static void main(String[] args) {
        char [] c={'a','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(c));
    }
}

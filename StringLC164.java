import java.util.*;

public class StringLC164 {
    public static String convertToTitle(int columnNumber) {
        if(columnNumber%26==0 && columnNumber<1000){
            if(columnNumber==26){
               return "Z";
            }else{
            return  (char)(columnNumber/26-1 +64)+"Z";
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        list = helper(columnNumber, list, columnNumber % 26);
        if (list.contains(64)) {
            int index = list.indexOf(64);
            list.remove(index);
            list.add(index + 1, 65);
        }
        if (list.size() > 3) {
            if (list.contains(65)) {
                int ind = list.indexOf(65);
                list.remove(ind);
                list.add(ind, 90);
                int val = list.get(ind + 1);
                list.remove(ind + 1);
                list.add(ind + 1, val - 1);
            }
        }
        System.out.println(list);
        for (int i = list.size() - 1; i >= 1; i--) {
            int a = list.get(i);
            str.append((char) (a));
        }

        return new String(str);

    }

    public static ArrayList<Integer> helper(int columnNumber, ArrayList<Integer> list, int rem) {

        if (columnNumber <= 26) {
            list.add(rem + 64);
            list.add(64 + columnNumber);

            return list;
        } else {
            list.add(64 + rem);
        }

        return helper(columnNumber / 26, list, columnNumber % 26);

    }

    public static void main(String[] args) {
        int a = 28;

        System.out.println(convertToTitle(a));
    }
}

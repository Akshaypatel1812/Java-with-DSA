import java.util.ArrayList;

public class ArrayLC682 {

     public static int calPoints(String[] operations) {
        ArrayList<Integer>list=new ArrayList<>();
        int sum=0;

        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                list.add(list.get(list.size()-1)+list.get(list.size()-2));
            }
            else if(operations[i].equals("D")){
                list.add(2*list.get(list.size()-1));
            }
            else if(operations[i].equals("C")){
                list.remove(list.size()-1);
            }
            else{
                 list.add(Integer.parseInt(operations[i]));
            }
        }

        for(int j=0;j<list.size();j++){
            sum=sum+list.get(j);
        }

        return sum;
    }
    public static void main(String[] args) {
        String [] str={"5","2","C","D","+"};

        System.out.println(calPoints(str));
    }
}

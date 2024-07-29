import java.util.*;

public class ArrayLC1380 {

    public static List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>colmun=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int col=0;
        for(int i=0;i<matrix.length;i++){
            min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    col=j;
                }
            }
            list.add(min);
            colmun.add(col);
        }

        //colmun
        int index=0;
        int max=Integer.MIN_VALUE;
        while(index!=list.size()){
            max=Integer.MIN_VALUE;
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][colmun.get(index)]>=max){
                    max=matrix[k][colmun.get(index)];
                }
            }
            if(max==list.get(index)){
                ans.add(max);
            }
            index++;
        }

        
        
        return ans;
    }
    public static void main(String[] args) {
        int [][] mat={
            {7,8},{1,2}
        };

        System.out.println(luckyNumbers(mat));
    }
}

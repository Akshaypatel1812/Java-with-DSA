import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}

public class TreeLC761 {
    public static int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer>list=new HashSet<>();
        
        helper(root, list);
        ArrayList<Integer>ans=new ArrayList<>(list);
        Collections.sort(ans);
        if(ans.size()==1 || ans.size()==0){
            return -1;
        }
       
        else{
            return ans.get(1);
        }
    }

    public static void helper(TreeNode root,HashSet<Integer>list){
        if(root==null){
           return;
        }

        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
    public static int minimumValue(TreeNode root,int min){
        if(root==null){
            return min;
        }
        if(root.val<min){
           min=root.val;
        }
 
        int lm= minimumValue(root.left, min);
        int rm= minimumValue(root.right,min);

        return Math.min(lm, rm);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.right.left=new TreeNode(5);
        root.right.right=new TreeNode(5);

        System.out.println(findSecondMinimumValue(root));
    }
}

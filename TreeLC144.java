import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
public class TreeLC144 {

    
    public static List<Integer> preorderTraversal(TreeNode root) {
       List<Integer>List=new ArrayList<>();
       helper(root, List);
       
       return List;
    }

    public static List<Integer> helper(TreeNode root,List<Integer>list){
        if(root==null){
            return list;
        }
 
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
 
        return list;

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left=new TreeNode(3);
    }
}

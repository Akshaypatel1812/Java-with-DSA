
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
public class TreeLC94 {
    public static void helper(TreeNode root){
        if(root==null){
            return;
        }

        helper(root.left);
        list.add(root.val);
        helper(root.right);  
    }
    static ArrayList<Integer>list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        helper(root);
        return list;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
    }
}

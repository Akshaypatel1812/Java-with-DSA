
import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeLC112 {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        int ans=0;
        if(dfs(root, ans, targetSum)){
            return true;
        }
        else{
            return false;
        }

    }

    public static boolean dfs(TreeNode node, int path,int target) {
        if (node == null)
            return false;

        // Append the current node's value to the path
        path += node.val;

        // If the current node is a leaf, print the path
        if (node.left == null && node.right == null) {
            // System.out.println(path);
            if(path==target){
                return true;
            }
            
        }
        return dfs(node.left, path ,target) || dfs(node.right, path,target);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);

        System.out.println(hasPathSum(root, 18));
    }
}

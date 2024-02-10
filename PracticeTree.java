import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class PracticeTree {

    public static int sumLeaf(TreeNode root,int sum){
        if(root==null){
            return sum;
        }
        if(root.left==null && root.right==null){
            sum+=root.val;
        }
        sum=sumLeaf(root.left, sum);
        sum=sumLeaf(root.right, sum);

        return sum;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);

        System.out.println(sumLeaf(root, 0));
    
    }
}

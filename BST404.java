import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

}

public class BST404 {

    public static int sumOfLeaves(TreeNode root, int sum) {
        if (root == null) {
            return sum;
        }
        if (root.left == null && root.right == null) {
            sum = sum + root.val;
        }

        sum = sumOfLeaves(root.left, sum);
        sum = sumOfLeaves(root.right, sum);

        return sum;
    }

    

    public static int sumOfLeftLeaves(TreeNode root) {
       int sum=0;
       sum=helper(root, sum);
       return sum;
    }

    public static int helper(TreeNode root,int sum){
        if (root == null) {
            return sum;
        }
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null && root.left != null) {
                sum = sum + root.left.val;
            }
        }

        sum = helper(root.left,sum);
        sum = helper(root.right,sum);

        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        System.out.println(sumOfLeaves(root, 0));

        System.out.println(sumOfLeftLeaves(root));
    }
}

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeSumTransform {

    public static int transform(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lst = transform(root.left);
        int rst = transform(root.right);

        int data = root.val;
        root.val = root.left.val + lst + root.right.val + rst;
        return data;
    }

    public static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.println(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        transform(root);
        preorder(root);

    }
}

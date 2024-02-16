import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;

    }
}

public class BSTLC230 {
    public static int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        list = inorder(root, list);

        return list.get(k-1);

    }

    public static ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return list;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);

        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        System.out.println(kthSmallest(root, 1));

    }
}

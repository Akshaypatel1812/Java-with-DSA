import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeLc111 {

    public static int minDepth(TreeNode root) {
        int depth=1;
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) {
            return 0;
        }
        q.add(root);
        while (!q.isEmpty()) {
            for (int i = 0; i < q.size(); i++) {
                TreeNode node = q.poll();
                if (node.left == null && node.right == null) {
                    return depth; // Found a leaf node, return the current depth
                }
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
                
            }
            depth++;
           
        }
        return depth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);

        System.out.println(minDepth(root, 1));

    }
}

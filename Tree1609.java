import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Tree1609 {
   
    public static boolean isEvenOddTree(TreeNode root) {
        int level = 0;
        if (root == null) {
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            Integer prevVal = null; // Keep track of the previous node value in each level

            for (int i = 0; i < size; i++) {
                TreeNode currNode = q.remove();

                // Check if the current node value violates the condition
                if ((level % 2 == 0 && (currNode.val % 2 == 0 || (prevVal != null && currNode.val <= prevVal))) ||
                        (level % 2 == 1 && (currNode.val % 2 == 1 || (prevVal != null && currNode.val >= prevVal)))) {
                    return false;
                }
                prevVal = currNode.val;

                // Add the children to the queue
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            level++;
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(10);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left=new TreeNode(7);
        root.right.right=new TreeNode(1);

        System.out.println(isEvenOddTree(root));
    }
}

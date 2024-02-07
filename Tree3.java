import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Tree3 {

    public static void KthTraversal(TreeNode root, int k) {
        int i = 1;
        if (root == null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            TreeNode currNode = q.remove();
            if (currNode == null) {
                i++;
                // System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (k == i) {
                    System.out.print(currNode.val);
                }
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }

        }

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root.val == p.val || root.val == q.val) {
            return root;
        }

        TreeNode ln = lowestCommonAncestor(root.left, p, q);
        TreeNode rn = lowestCommonAncestor(root.right, p, q);

        if (ln == null) {
            return rn;
        }
        if (rn == null) {
            return ln;
        }

        return root;
    }

    public static int distanceBetweenNodes(TreeNode n1, TreeNode n2) {
        if (n1 == null) {
            return -1;
        }

        if (n1.val == n2.val) {
            return 0;
        }

        int DFL = distanceBetweenNodes(n1.left, n2);
        int DFR = distanceBetweenNodes(n1.right, n2);

        if (DFL == -1 && DFR == -1) {
            return -1;
        } else if (DFL == -1) {
            return DFR + 1;
        } else {
            return DFL + 1;
        }

    }

    public static int minDistance(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode lca = lowestCommonAncestor(root, p, q);

        int d1 = distanceBetweenNodes(lca, p);
        int d2 = distanceBetweenNodes(lca, q);

        return d1 + d2;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        // KthTraversal(root, 3);

        TreeNode p = root.left.right;
        TreeNode q = root.right.right;

        // System.out.println(lowestCommonAncestor(root, p, q).val);

        System.out.println(distanceBetweenNodes(root.left, root.right.right)); // it is of same sides

        System.out.println(minDistance(root, p, q));

    }
}

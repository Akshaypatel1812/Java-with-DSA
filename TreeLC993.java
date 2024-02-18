class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeLC993 {
    

    public static boolean sameParent(TreeNode root, int value1, int value2) {
        if (root == null || value1 == value2) {
            return false; // Invalid input
        }
        TreeNode node1 = findNode(root, value1);
        TreeNode node2 = findNode(root, value2);
        if (node1 == null || node2 == null) {
            return false; // One or both values not found in the tree
        }
        TreeNode parent1 = findParent(root, node1);
        TreeNode parent2 = findParent(root, node2);
        return parent1 != null && parent2 != null && parent1 == parent2;
    }

    // Helper function to find a node with a given value in the binary tree
    private static TreeNode findNode(TreeNode root, int value) {
        if (root == null || root.val == value) {
            return root;
        }
        TreeNode left = findNode(root.left, value);
        if (left != null) {
            return left;
        }
        return findNode(root.right, value);
    }

    // Helper function to find the parent node of a given node in the binary tree
    private static TreeNode findParent(TreeNode root, TreeNode node) {
        if (root == null || root == node) {
            return null;
        }
        if ((root.left == node) || (root.right == node)) {
            return root;
        }
        TreeNode left = findParent(root.left, node);
        if (left != null) {
            return left;
        }
        return findParent(root.right, node);
    }
    public static int distance(TreeNode root, int d, int count) {
        if (root == null) {
            return -1;
        }
        if (root.val == d) {
            return count;
        }

        int ld = distance(root.left, d, count + 1);
        int rd = distance(root.right, d, count + 1);

        if (ld == -1 && rd == -1) {
            return -1;
        } else if (ld != -1) {
            return ld;
        } else {
            return rd;
        }
    }

    public static boolean isCousins(TreeNode root, int x, int y) {
        int d1 = distance(root, x, 0);
        int d2 = distance(root, y, 0);

        if(sameParent(root, x, y)){
            return false;
        }

        if (d1 == d2 && d1 > 1 && d2 > 1) {
            return true;
        }



        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right=new TreeNode(5);

        // TreeNode root = new TreeNode(1);
        // root.left = new TreeNode(2);
        // root.right = new TreeNode(3);
        // root.left.left = null;
        // root.left.right = null;
        // root.right.left = new TreeNode(4);
        // root.right.right = new TreeNode(5);
        // root.right.left.left = null;
        // root.right.left.right = null;
        // root.right.right.left = null;
        // root.right.right.right = null;


        System.out.println(isCousins(root, 2, 3));
        
    }
}

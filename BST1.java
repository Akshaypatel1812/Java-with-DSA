import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;

    }
}

public class BST1 {

    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        }

        else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + "->");
        inorder(root.right);

    }

    public static boolean search(TreeNode root, int key) {
        if (root == null) {
            return false;
        }
        if (root.val == key) {
            return true;
        }

        if (key > root.val) {
            return search(root.right, key);
        } else {
            return search(root.left, key);
        }
    }

    public static TreeNode findInorderSuccessor(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            // if we want to delete leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // if root has one child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // voila case
            TreeNode IS = findInorderSuccessor(root.right);
            root.val = IS.val;
            root.right = deleteNode(root.right, IS.val);
        }

        return root;
    }

    public static void printRangeVal(TreeNode root, int low, int high) {
        if (root == null) {
            return;
        }

        printRangeVal(root.left, low, high);
        if (low <= root.val && high >= root.val) {
            System.out.print(root.val + "->");
        }
        printRangeVal(root.right, low, high);
    }

    static int sum = 0;

    public static int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        if (root == null) {
            return sum;
        }

        rangeSumBST(root.left, low, high);
        if (low <= root.val && high >= root.val) {
            sum = sum + root.val;
        }
        rangeSumBST(root.right, low, high);
        return sum;
    }

    public static void printpath(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Leaf(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left == null && root.right == null) {
            System.out.println(list);
        }
        printRoot2Leaf(root.left, list);
        printRoot2Leaf(root.right, list);

        list.remove(list.size() - 1);

    }
    
    public static TreeNode mirrorTree(TreeNode root){
        if(root==null){
            return null;
        }

        TreeNode leftMirror=mirrorTree(root.left);
        TreeNode rightMirror=mirrorTree(root.right);

        root.left=rightMirror;
        root.right=leftMirror;

        return root;
        
    }
   

    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 6, 10, 11, 14 };

    //       8
    //     /   \
    //    5     10
    //   / \      \
    //  3   6     11
    //            /
    //           14
        TreeNode root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // inorder(root);
        // System.out.println();

        // System.out.println(search(root, 2));

        // deleteNode(root, 10);
        inorder(root);

        // printRangeVal(root, 5, 11);

        // System.out.println("\n" + rangeSumBST(root, 7, 15));
        // ArrayList<Integer> list = new ArrayList<>();
        // printRoot2Leaf(root, list);

        root=mirrorTree(root);
    //       8
    //     /   \
    //   10     5
    //      \   / \
    //      11 6   3
    //          \
    //          14

        System.out.println("\ninorder after mirror");
        inorder(root);
    }
}

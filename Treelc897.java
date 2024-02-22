import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Treelc897 {
    public static TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        
        inorder(root, list);
        
        TreeNode nr = new TreeNode(0);
        TreeNode temproot=nr;
        
        for (int i = 0; i < list.size(); i++) {
            TreeNode node = list.get(i);
            temproot.right = new TreeNode(node.val);
            temproot = temproot.right;
        }

        return nr.right;
    }

    public static ArrayList<TreeNode> inorder(TreeNode root, ArrayList<TreeNode> list) {
        if (root == null) {
            return list;
        }

        inorder(root.left, list);
        list.add(root);
        inorder(root.right, list);

        return list;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        printTree(root.left);
        System.out.println(root.val);
        printTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left=new TreeNode(3);
        // printTree(root);
        TreeNode neew = increasingBST(root);
        printTree(neew);
    }
}

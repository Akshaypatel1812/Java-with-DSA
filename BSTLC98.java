import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

}

public class BSTLC98 {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    public static boolean isValidBST(TreeNode root) {
        if(root.left==null && root.right==null){
            return true;
        }
        inorder(root);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false; // Not sorted
            }
        }
        return true; // Sorted

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        // root.left = new TreeNode(-1);
        root.right = new TreeNode(-1);
        // root.right.left = new TreeNode(6);
        // root.right.right = new TreeNode(2);
        
       
        System.out.println(isValidBST(root));
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}

public class TreeLC226 {

    public static TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }

        TreeNode leftTree=invertTree(root.left);
        TreeNode rightTree=invertTree(root.right);

        root.left=rightTree;
        root.right=leftTree;

        return root;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.right=new TreeNode(6);

    }   
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}

public class BST700 {
    public static TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(val==root.val){
            return root;
        }

        if(val<root.val){
           return searchBST(root.left, val);
        }else{
            return searchBST(root.right, val);
        }
    }

    public static void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);

    
        root=searchBST(root, 2);
        inorder(root);
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}
public class TreeLC965 {

    public static boolean isUnivalTree(TreeNode root) {
        int val=root.val;
        // System.out.println(val);
        if(helper(root, val)){
            return true;
        }else{
            return false;
        }

    }

    public static boolean helper(TreeNode root,int val){
        if(root==null){
            return true;
        }
        // System.out.println(root.val + " & "+val);

        if(val != root.val){
            return false;
        }
         return helper(root.left, val) && helper(root.right, val);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(1);
        root.left.left=new TreeNode(5);
        root.left.right=new TreeNode(1);
        root.right=new TreeNode(1);
        root.right.right=new TreeNode(1);

        System.out.println(isUnivalTree(root));
    }
}

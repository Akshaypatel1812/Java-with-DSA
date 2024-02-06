class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}

public class Tree2 {

    public static boolean isIdentical(TreeNode node,TreeNode subTreeNode){
        if(node==null && subTreeNode==null){
            return true;
        }

        else if(node==null || subTreeNode==null ||node.val!=subTreeNode.val){
            return false;
        } 

        if(!isIdentical(node.left, subTreeNode.left)){
            return false;
        }
        if(!isIdentical(node.right, subTreeNode.right)){
            return false;
        }

        return true;

    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;           // because subroot is non empty
        }

        if(root.val==subRoot.val){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
     public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        // root.left.right=new TreeNode(5);
        root.right=new TreeNode(3);
        root.right.right=new TreeNode(7);
        root.right.left=new TreeNode(6);

        TreeNode subRoot=new TreeNode(2);
        subRoot.left=new TreeNode(4);
        subRoot.right=new TreeNode(5);


        System.out.println(isSubtree(root, subRoot));
     }
}

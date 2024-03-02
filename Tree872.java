import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}

public class Tree872 {

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        helper(root1, list1);
        helper(root2, list2);
        if(list1.equals(list2)){
            return true;
        }
        
        return false;
    }
    public static void helper(TreeNode root,ArrayList<Integer>list){
        if(root==null){
            return;
        }
         if(root.left==null && root.right==null){
            list.add(root.val);
         }

         helper(root.left, list);
         helper(root.right, list);

        
    }

   
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        TreeNode root2=new TreeNode(1);
        root2.left=new TreeNode(2);
        root2.right=new TreeNode(3);

        System.out.println(leafSimilar(root, root2));
    }
}

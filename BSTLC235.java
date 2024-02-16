import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
public class BSTLC235 {

    public static boolean getpath(TreeNode root,ArrayList<TreeNode>list,int n){
        if(root==null){
            return false;
        }
        list.add(root);

        if(root.val==n){
          return true;
        }

        boolean left=getpath(root.left, list, n);
        boolean right=getpath(root.right, list, n);

        if(left || right){
            return true;
        }

        list.remove(list.size()-1);
        return false;

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode>path1=new ArrayList<>();
        ArrayList<TreeNode>path2=new ArrayList<>();

        getpath(root,path1,p.val);
        getpath(root,path2,q.val);
        int i=0;
        for(;i<path1.size()-1;i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }

        TreeNode lca=path1.get(i-1);
        return lca;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        System.out.println(lowestCommonAncestor(root, root.left, root.right).val);
    }
}

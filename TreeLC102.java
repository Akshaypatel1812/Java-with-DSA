
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeLC102 {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> list= new LinkedList<>();
        list.add(root);
        
        while(!list.isEmpty()){
            int levelsize=list.size();
            List<Integer> levelList=new LinkedList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode currNode=list.remove();
                levelList.add(currNode.val);

                if(currNode.left!=null){
                    list.add(currNode.left);
                }
                if(currNode.right!=null){
                    list.add(currNode.right);
                }
            }
             
            result.add(levelList);
            
        }
        return result;

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        levelOrder(root);
    }
}

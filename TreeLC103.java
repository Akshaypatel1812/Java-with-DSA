import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeLC103 {

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
    
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> levelList = new ArrayList<>();
    
            for (int i = 0; i < size; i++) {
                TreeNode currNode = q.remove();
                if (leftToRight) {
                    levelList.add(currNode.val);
                } else {
                    levelList.add(0, currNode.val); // Insert at the beginning for zigzag we shift the value from left to right
                }
    
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            leftToRight = !leftToRight; // Change direction for next level
            result.add(levelList);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);

        System.out.println(zigzagLevelOrder(root));
    }
}

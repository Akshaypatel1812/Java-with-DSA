import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeLC113 {
   
    public static List<List<Integer>> pathSum(TreeNode root,int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        dfs(root, currentPath, result,target);
        return result;
    }

    private static void dfs(TreeNode node, List<Integer> currentPath, List<List<Integer>> result,int target) {
        if (node == null)
            return;

        // Add current node to the current path
        currentPath.add(node.val);
        target=target-node.val;
        // If it's a leaf node, add current path to result
        if (node.left == null && node.right == null && target==0) {
            result.add(new ArrayList<>(currentPath)); // Make a copy of current path
        } else {
            // Recursively traverse left and right subtrees
            dfs(node.left, currentPath, result,target);
            dfs(node.right, currentPath, result,target);
        }

        // Backtrack: Remove the current node from the current path
        currentPath.remove(currentPath.size() - 1);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        // root.left.left.left = new TreeNode(7);

        System.out.println(pathSum(root,8));

    }
}

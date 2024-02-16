import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeLC515 {

    public static int findMax(Queue<TreeNode> queue) {
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer value

        // Perform BFS traversal
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            // Update max if the value of the current node is greater
            if (node.val > max) {
                max = node.val;
            }
            // Add child nodes to the queue
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return max;
    }

    public static List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        list=BFS(root,list);
        return list;
    }

    public static ArrayList<Integer> BFS(TreeNode root, ArrayList<Integer>list) {
        if (root == null) {
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();        //Here queue structure is root,null,root.left,root.right,null
        q.add(root);
    

        while(!list.isEmpty()){
            int levelsize=list.size();
            
            for(int i=0;i<levelsize;i++){
                list.add(findMax(q));
                TreeNode currNode=q.remove();
                

                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
             
           
            
        }

        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        System.out.println(largestValues(root));

    }
}

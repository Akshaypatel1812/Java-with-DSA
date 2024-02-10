import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

}

public class BST129 {

    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        }

        else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static int concatenateArrayList(ArrayList<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (Integer num : list) {
            sb.append(num);
        }
        return Integer.parseInt(sb.toString());
    }

    public static int printRoot2Leaf(TreeNode root, ArrayList<Integer> list, int sum) {
        if (root == null) {
            return sum;
        }
        
        list.add(root.val);
        
        if (root.left == null && root.right == null) {
            StringBuilder sb = new StringBuilder();
            for (Integer num : list) {
                sb.append(num);
            }
            sum =sum+ Integer.parseInt(sb.toString());
        } else {
            sum = printRoot2Leaf(root.left, list, sum);
            sum = printRoot2Leaf(root.right, list, sum);
        }
    
        list.remove(list.size() - 1);
    
        return sum;
    }
    
    public static int sumNumbers(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        return printRoot2Leaf(root, list, 0);
    }
    
    

    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 6, 10, 11, 14 };
        TreeNode root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println(sumNumbers(root));
    }
}

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class TreeLC1022 {

    public int sumRootToLeaf(TreeNode root) {
        String path = "";
        int sum = 0;
        int ans = pathsum(root, path, sum);

        return ans;

    }

    public static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        int power = 0;

        for (int i = binaryString.length() - 1; i >= 0; i--) {

            int bit = binaryString.charAt(i) - '0';

            decimal += bit * Math.pow(2, power);

            power++;
        }

        return decimal;
    }

    public static int pathsum(TreeNode root, String path, int sum) {
        if (root == null) {
            return sum;
        }

        path = path + root.val;
        if (root.left == null && root.right == null) {

            sum = sum + binaryToDecimal(path);
            return sum;
        }

        sum = pathsum(root.left, path, sum);
        sum = pathsum(root.right, path, sum);

        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        System.out.println(pathsum(root, "", 0));
    }
}
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BSTLC333 {

    public static int size(TreeNode root,int size){
        if(root==null){
            return 0;
        }

        int ls=size(root.left,size++);
        int rs=size(root.right,size++);

        return ls+rs+1;
    }

    public static void getinorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        getinorder(root.left, list);
        list.add(root.val);
        getinorder(root.right, list);
    }

    public static boolean isValidate(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        getinorder(root, list);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }

        return true;

    }

    public static int validSubTree(TreeNode root) {
        if (isValidate(root)){
            return size(root, 0);
        }
            

        int lss=validSubTree(root.left);
        int rss=validSubTree(root.right);

        return Math.max(lss, rss);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(60);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(20);
        root.right.left = new TreeNode(45);
        root.right.right = new TreeNode(70);
        root.right.right.left = new TreeNode(65);
        root.right.right.right = new TreeNode(80);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(validSubTree(root));

    }
}

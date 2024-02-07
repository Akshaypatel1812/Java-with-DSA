import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Tree257 {
    // static ArrayList<String> stringList = new ArrayList<>();
    // static String str1="";
    // static String str2="";
    public static  List<String> binaryTreePaths(TreeNode root) {
        String s="";
        List l=new ArrayList<>();
        return solve(root,l,s);
    }
    public static List<String> solve(TreeNode root,List l, String s){
        if(root==null) return l;
        if(root.left==null && root.right==null){    //if it is a leaf node
            l.add(s+root.val);
            return l;
        }
        s= s+root.val+"->";
        solve(root.left, l, s);
        solve(root.right, l, s);
        return l;    
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        // root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(3);
        // root.right.right = new TreeNode(6);


        System.out.println(binaryTreePaths(root));
    }
}

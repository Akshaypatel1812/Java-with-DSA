import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class GFGLC333 {

    public static int size(Node root,int size){
        if(root==null){
            return 0;
        }

        int ls=size(root.left,size++);
        int rs=size(root.right,size++);

        return ls+rs+1;
    }

    public static void getinorder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        getinorder(root.left, list);
        list.add(root.val);
        getinorder(root.right, list);
    }

    public static boolean isValidate(Node root) {

        ArrayList<Integer> list = new ArrayList<>();
        getinorder(root, list);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }

        return true;

    }

    public static int largestBst(Node root) {
        if (isValidate(root)){
            return size(root, 0);
        }
            

        int lss=largestBst(root.left);
        int rss=largestBst(root.right);

        return Math.max(lss, rss);

    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(40);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(largestBst(root));

    }
}

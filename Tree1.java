import java.util.*;

// import queueUsing2Stacks.Queue;

class node {
    int val;
    node left;
    node right;

    node(int val) {
        this.val = val;
    }
}

public class Tree1 {

    public static void preorder(node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void postorder(node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void BFS(node root) {
        if (root == null) {
            return;
        }
        Queue<node> q = new LinkedList<>();        //Here queue structure is root,null,root.left,root.right,null
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }else{
                System.out.print(currNode.val);
                if(currNode.left!=null){
                   q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }

    }

    public static int height(node root){
        if(root==null){
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int NoOfNodes(node root){
        if(root==null){
            return 0;
        }

        int lh=NoOfNodes(root.left);
        int rh=NoOfNodes(root.right);
        return lh+rh+1;
    }

    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.right = new node(6);

        // System.out.println("preorder traversal:");
        // preorder(root);
        // System.out.println("\ninorder traversal:");
        // inorder(root);

        // System.out.println("\npostorder traversal:");
        // postorder(root);

        BFS(root);

        System.out.println(height(root));

        System.out.println(NoOfNodes(root));
    }
}

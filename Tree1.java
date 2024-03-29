import java.util.*;

import org.w3c.dom.Node;

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

    public static void dfs(node node, String path) {
        if (node == null)
            return;

        // Append the current node's value to the path
        path += node.val;

        // If the current node is a leaf, print the path
        if (node.left == null && node.right == null) {
            System.out.println(path);
            return;
        }

        // Continue DFS traversal for left and right subtrees
        dfs(node.left, path );
        dfs(node.right, path);
    }


    //here we find out the height of the tree 
    public static int height(node root){
        if(root==null){
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }


    //here we find out the no of nodes in tree
    public static int NoOfNodes(node root){
        if(root==null){
            return 0;
        }

        int lh=NoOfNodes(root.left);
        int rh=NoOfNodes(root.right);
        return lh+rh+1;
    }


    //here we find out the sum of all the nodes val
    public static int SumofNodes(node root){
        if(root==null){
            return 0;
        }

        int lsum=SumofNodes(root.left);
        int rsum=SumofNodes(root.right);
        return lsum+rsum+root.val;

    }

    public static void SumofNodes2(node root,int sum){
       
        if(root==null){
            System.out.println(sum);
            return;
        }

        // System.out.println(root.val);
        sum=sum+root.val;
        SumofNodes2(root.left,sum);
        SumofNodes2(root.right,sum);
       
        
    }

    public static int diameterOfTree(node root){
        if(root==null){

            return 0;
        }

        int ld=diameterOfTree(root.left);
        int rd=diameterOfTree(root.right);

        int lh=height(root.left);
        int rh=height(root.right);

        int rootD=lh+rh+1;

        int LR=Math.max(ld, rd);
        int Root=Math.max(rootD, LR);

        return Math.max(LR, Root);
    }

    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.right = new node(6);
        root.left.left.left = new node(7);
        // root.left.right.right = new node(8);


        // System.out.println("preorder traversal:");
        // preorder(root);
        // System.out.println("\ninorder traversal:");
        // inorder(root);

        // System.out.println("\npostorder traversal:");
        // postorder(root);

        BFS(root);

        // System.out.println(height(root));

        // System.out.println(NoOfNodes(root));

        // System.out.println(SumofNodes(root));

        // SumofNodes2(root,0);

        // System.out.println( diameterOfTree(root));

        // System.out.println(SumofNodes(root));

        // dfs(root,"");

        
    }
}

class node{
    int val;
    node left;
    node right;

    node(int val){
        this.val=val;
    }
}

public class Tree1 {

    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void postorder(node root){
        if(root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        
        System.out.println("preorder traversal:");
        preorder(root);
        System.out.println("\ninorder traversal:");
        inorder(root);

        System.out.println("\npostorder traversal:");
        postorder(root);
    }
}

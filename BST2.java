import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}




public class BST2 {

    public static TreeNode sortedArrayToBST(int [] nums){
       int start=0;
       int end=nums.length-1;
       TreeNode ans=helper(nums, start, end);
       return ans;
    }

    public static TreeNode helper(int [] nums,int start,int end){
        if(start>end){
            return null;
        }
        int mid=start+(end-start)/2;

        TreeNode newNode=new TreeNode(nums[mid]);

        newNode.left=helper(nums, start, mid-1);
        newNode.right=helper(nums, mid+1, end);

        return newNode;
    }

    public static void preOrder(TreeNode root){
        if(root==null){
            return;
        }

        System.out.print(root.val+"->");
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void inorder(TreeNode root,ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
    
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    
    } 

    public static TreeNode createBST(ArrayList<Integer>list,int start,int end){
        if(start>end){
            return null;
        }
       
        int mid=start+(end-start)/2;

        TreeNode newNode=new TreeNode(list.get(mid));

        newNode.left=createBST(list,start,mid-1);
        newNode.right=createBST(list, mid+1, end);

        return newNode;
        

    }

    public static TreeNode balanceBST(TreeNode root,ArrayList<Integer>list){
        
        inorder(root, list);
        root=createBST(list, 0, list.size()-1);

        return root;

    }
    public static void main(String[] args) {
        int [] arr={3,5,6,8,10,11,12};

        TreeNode root=new TreeNode(8);
        root.left=new TreeNode(6);
        root.left.left=new TreeNode(5);
        root.left.left.left=new TreeNode(3);
        root.right=new TreeNode(10);
        root.right.right=new TreeNode(11);
        root.right.right.right=new TreeNode(12);

        
        ArrayList<Integer>list=new ArrayList<>();
        root=balanceBST(root, list);
        preOrder(root);
        // TreeNode root=sortedArrayToBST(arr);


        
        
    }
}

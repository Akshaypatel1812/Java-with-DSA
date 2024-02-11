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
    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
    
        inorder(root.left);
        System.out.print(root.val + "->");
        inorder(root.right);
    
    } 
    public static void main(String[] args) {
        int [] arr={3,5,6,8,10,11,12};

        TreeNode root=sortedArrayToBST(arr);
        inorder(root);
    }
}

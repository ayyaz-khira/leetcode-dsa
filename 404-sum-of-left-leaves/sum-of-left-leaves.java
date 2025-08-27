/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public void addLeftLeaves(TreeNode root,int arr[],boolean isLeft){
        if(root==null) return;

        if(root.left==null && root.right==null && isLeft){
            arr[0]+=root.val;
        }

        addLeftLeaves(root.left,arr,true);
        addLeftLeaves(root.right,arr,false);
    }


    public int sumOfLeftLeaves(TreeNode root) {

        int arr[]={0};
        addLeftLeaves(root,arr,false);

        return arr[0];
        
    }
}
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

    public void sumLeft(TreeNode root,boolean isLeft,int arr[]){
        if(root==null) return;

        if(isLeft && root.left==null && root.right==null){
            arr[0]+=root.val;
        }

        sumLeft(root.left,true,arr);
        sumLeft(root.right,false,arr);

        
    }

    public int sumOfLeftLeaves(TreeNode root) {
        boolean isLeft=false;
        int arr[]={0};
        sumLeft(root,isLeft,arr);


        return arr[0];

    }
}
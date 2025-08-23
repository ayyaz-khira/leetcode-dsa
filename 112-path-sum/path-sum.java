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
    public boolean pathExists(TreeNode root,int target){

        if(root==null){
            return false;
        }
        target-=root.val;
        
        if(target==0 && root.left==null && root.right==null){
            return true;
        }

        if(pathExists(root.left,target) ||
         pathExists(root.right,target)) return true;

        return false;

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathExists(root,targetSum);
        
    }
}
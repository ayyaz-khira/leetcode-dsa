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

    public int dfs(TreeNode root,int res[]){
        if(root==null) return 0;

        int lh=dfs(root.left,res);
        int rh=dfs(root.right,res);

        res[0]=Math.max(res[0],lh+rh);

        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int res[]={0};
        dfs(root,res);
        

        return res[0];
    }
}
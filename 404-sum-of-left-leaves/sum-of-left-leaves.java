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

    public void solve(TreeNode root,boolean isLeft,int sum[]){
        if(root==null) return;

        if(isLeft && root.left==null && root.right==null){
            sum[0]+=root.val;
        }

        solve(root.left,true,sum);
        solve(root.right,false,sum);
    }


    public int sumOfLeftLeaves(TreeNode root) {
        int sum[]={0};
        solve(root,false,sum);
        return sum[0];
    }
}
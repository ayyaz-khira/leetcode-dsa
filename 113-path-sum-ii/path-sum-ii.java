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

    public void solve(TreeNode root,int target,List<Integer> comb,List<List<Integer>> res){
        if(root==null) return;

        comb.add(root.val);
        target-=root.val;

        if(target==0 && root.left==null && root.right==null){
            res.add(new ArrayList<>(comb));
        }

        solve(root.left,target,comb,res);
        solve(root.right,target,comb,res);


        comb.remove(comb.size()-1);
    }


    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> comb=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        solve(root,targetSum,comb,res);
        return res;
    }
}
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

    public void solve(TreeNode root,int target,List<List<Integer>> res,List<Integer> comb){
        if(root==null) return;
        target-=root.val;
        comb.add(root.val);

        if(target==0 && root.left==null && root.right==null){
            List<Integer> list=new ArrayList<>(comb);
            res.add(list);
        }

        solve(root.left,target,res,comb);
        solve(root.right,target,res,comb);
        comb.remove(comb.size()-1);


        

    }


    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();

        solve(root,targetSum,res,comb);

        return res;
    }
}
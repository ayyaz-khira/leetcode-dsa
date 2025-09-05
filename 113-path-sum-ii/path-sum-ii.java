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

    public void pathSumHelp(TreeNode root,int target,List<Integer> list,List<List<Integer>> res){
        if(root==null) return;

        list.add(root.val);
        target-=root.val;

        if(target==0 && root.left==null && root.right==null){
            List<Integer> comb=new ArrayList<>(list);
            res.add(comb);
        }


        pathSumHelp(root.left,target,list,res);
        pathSumHelp(root.right,target,list,res);
        
        list.remove(list.size()-1);

    }


    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        pathSumHelp(root,targetSum,list,res);
        return res;
    }
}
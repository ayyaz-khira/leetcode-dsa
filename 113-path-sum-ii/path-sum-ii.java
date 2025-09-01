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

    public void pathSumHelp(TreeNode root, int target,List<List<Integer>> res,List<Integer> list){
        if(root==null) return;

        list.add(root.val);
        target-=root.val;
        if(target==0 && root.left==null && root.right==null){
            List<Integer> arr=new ArrayList<>(list);
            res.add(arr);
        }


        pathSumHelp(root.left,target,res,list);
        pathSumHelp(root.right,target,res,list);
        list.remove(list.size()-1);
    }


    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        pathSumHelp(root,targetSum,res,list);

        return res;
    }
}
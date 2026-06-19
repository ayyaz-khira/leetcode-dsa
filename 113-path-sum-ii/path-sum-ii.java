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

    public void recurse(List<List<Integer>> res, List<Integer> list, int target, TreeNode node){
        if(node==null) return;

        list.add(node.val);
        target-=node.val;

        if(target==0 && node.left==null && node.right==null) {
            res.add(new ArrayList<>(list));
        }



        recurse(res,list,target,node.right);
        recurse(res,list,target,node.left);

        list.remove(list.size()-1);



    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        recurse(res,list,targetSum,root);

        return res;
   
    }
}
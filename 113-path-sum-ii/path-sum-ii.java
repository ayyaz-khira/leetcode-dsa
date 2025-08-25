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

    public void solve(TreeNode root,int target,List<Integer> arr,List<List<Integer>> res){
        if(root==null){
            return;
        }

        arr.add(root.val);
        target-=root.val;

        if(target==0 && root.left==null && root.right==null){
            res.add(new ArrayList<>(arr));
            
        }

        solve(root.left,target,arr,res);
        solve(root.right,target,arr,res);
        arr.remove(arr.size()-1);



    }



    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        solve(root,target,arr,res);


        return res;
    }
}
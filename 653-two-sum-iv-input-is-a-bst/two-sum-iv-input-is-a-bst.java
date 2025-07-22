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

    public void preorder(TreeNode root,ArrayList<Integer> arr){
        if(root!=null){
            arr.add(root.val);
            preorder(root.left,arr);
            preorder(root.right,arr);
        }
    }

    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        preorder(root,arr);
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            if(set.contains(k-x)){
                return true;
            }
            set.add(x);
        }


        return false;


        
    }
}
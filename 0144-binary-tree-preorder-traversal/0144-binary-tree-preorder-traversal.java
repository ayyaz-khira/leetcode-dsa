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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        if(root==null) return list;
        Stack<TreeNode> stk=new Stack<>();
        stk.push(root);
        while(!stk.isEmpty()){
            TreeNode top=stk.pop();
            list.add(top.val);
            if(top.right!=null){
                stk.push(top.right);
            }
            if(top.left!=null){
                stk.push(top.left);
            }
        }

        return list;

        
    }
}
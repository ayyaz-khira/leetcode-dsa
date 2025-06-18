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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stk1=new Stack<>();
        Stack<TreeNode> stk2=new Stack<>();
        List<Integer> list=new LinkedList<>();
        if(root==null) return list;
        stk1.push(root);
        while(!stk1.isEmpty()){
            TreeNode top=stk1.pop();
            stk2.push(top);
            if(top.left!=null){
                stk1.push(top.left);
            }
            if(top.right!=null){
                stk1.push(top.right);
            }
            

        }
        while(!stk2.isEmpty()){
            list.add(stk2.pop().val);
        }

        return list;
        
    }
}
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();

        if(root==null) return res;

        queue.offer(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=queue.poll();
                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null) queue.offer(temp.right);
                list.add(temp.val);
            }
            res.add(list);
        }


        return res;
    }
}
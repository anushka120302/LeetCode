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
    public boolean isCompleteTree(TreeNode root) {
        if(root==null)
        return true;

        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        boolean flag=false;

        while(!queue.isEmpty()){
        TreeNode node =queue.poll();
        if(node==null){
        flag=true;
        continue;
        }

        if(flag)
        return false;

        queue.add(node.left);
        queue.add(node.right);

        }
        return true;

    }
   
}
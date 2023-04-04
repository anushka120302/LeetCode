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
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        
        return depth(root);
    }
    int depth(TreeNode node)
    {
        if(node==null)
            return 0;
       
        int lh=depth(node.left);
        int rh=depth(node.right);
          if(lh==0 || rh==0)
            return Math.max(lh,rh)+1;
        else 
         return Math.min(lh,rh)+1;
    }
}
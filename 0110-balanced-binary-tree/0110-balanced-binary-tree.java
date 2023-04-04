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
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        
        return height(root)!=-1;
    }
    
   int height(TreeNode node)
   {
       if(node==null)
           return 0;
       
       int LH=height(node.left);
       if(LH==-1)
           return -1;
       int RH=height(node.right);
       if(RH==-1)
           return -1;
       if(LH-RH<-1 || LH-RH>1)
           return -1;
       return Math.max(LH,RH) +1;
   }
}
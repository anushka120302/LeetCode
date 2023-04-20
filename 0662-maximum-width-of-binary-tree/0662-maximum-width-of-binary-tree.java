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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode,Integer>> queue= new LinkedList<>();
        
        queue.offer(new Pair<>(root,1));
        int maxWidth=0;
        
        
        while(! queue.isEmpty())
        {
            int startindex=queue.peek().getValue();
            int endindex=1;
            int levelSize=queue.size();
            
            for(int i =0;i<levelSize;i++)
            {
                Pair<TreeNode, Integer> pair=queue.poll();
                endindex=pair.getValue();
                TreeNode node = pair.getKey();
                
                if(node.left!=null)
                {
                    queue.offer(new Pair<>(node.left,2*endindex));
                }
                if(node.right!=null)
                {
                    queue.offer(new Pair<>(node.right,2*endindex+1));                    
                }  
            }
             maxWidth= Math.max(maxWidth, endindex-startindex+1);
        }
        return maxWidth;
    }
}
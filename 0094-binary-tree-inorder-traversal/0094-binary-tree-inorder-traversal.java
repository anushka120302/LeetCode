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
/*class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        helper(root,res);
        return res;
    }
    
    public void helper(TreeNode root, List<Integer> nums)
    {
        
        if(root!=null)
        {
            if (root.left!=null)
            {
                helper(root.left,nums);
            }
            nums.add(root.val);
            if(root.right!=null)
            {
                helper(root.right,nums);
            }
        }
        
       
    }
}*/

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list=new ArrayList<>();
        
        TreeNode curr=root;
        
        while(curr!=null){
            
            
            if(curr.left==null){
                
                list.add(curr.val);
                curr=curr.right;
                
            }
            else{
                
                
                TreeNode rightmost=curr.left;
                
                while(rightmost.right!=null && rightmost.right!=curr){
                    
                    rightmost=rightmost.right;
                    
                }
                
                if(rightmost.right==null){

                    rightmost.right=curr;
                    curr=curr.left;
                }
                else{
                    
                    TreeNode temp=rightmost.right;
                    rightmost.right=null;
                    list.add(temp.val);
                    curr=temp.right;
                }
            }
        }
        return list;
    }
}
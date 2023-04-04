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
    private int pos=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        pos=postorder.length-1;
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return makeTree(inorder, postorder,0,inorder.length-1,map);
    }
    private TreeNode makeTree(int inorder[], int postorder[], int start_inorder, int end_inorder, HashMap<Integer,Integer> map)
    {
       
        if(pos<0 || start_inorder>end_inorder)
        return null;

        int val=postorder[pos];

        TreeNode node= new TreeNode(val);
        pos--;

        int i = map.get(val);

        
        TreeNode right=makeTree(inorder, postorder,i+1,end_inorder,map);
        TreeNode left=makeTree(inorder, postorder,start_inorder,i-1,map);

        node.right=right;
        node.left=left;
        
        return node;
    }

}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> arr= new ArrayList<>();
        int n =0;
        while(head!=null)
        {
            arr.add(head.val);
            head= head.next;
            n++;
        }
        TreeNode node= Sorting(arr,0,n-1);
        return node;
    }
    public TreeNode Sorting(List<Integer> arr, int start, int end)
    {
        if(start>end)
        return null;
        
            int mid=(start+end)/2;
            TreeNode node = new TreeNode(arr.get(mid));
            node.left=Sorting(arr,start,mid-1);
            node.right=Sorting(arr,mid+1,end);



             return node;
        
       
    }
}
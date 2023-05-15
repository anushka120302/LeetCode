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
class Solution 
{
    public ListNode swapNodes(ListNode head, int k) 
    {
        ListNode itr=head;
        for(int i =1;i<k;i++)
        {
            itr=itr.next;
        }
        
        ListNode node1 = itr;
        ListNode node2 = head;
        
        while(itr.next!=null)
        {
            itr= itr.next;
            node2=node2.next;
        }
        
        int temp = node1.val;
        node1.val=node2.val;
        node2.val=temp;
        
        
        return head;
    }
}
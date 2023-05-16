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
    public ListNode swapPairs(ListNode head) 
    {
        ListNode node = new ListNode(0);
        node.next= head;
        ListNode curr = node ;
        
        while(curr.next!=null && curr.next.next!=null)
        {
            ListNode first = curr.next;
            ListNode second = curr.next.next;
            curr.next = second;
            first.next= second.next;
            second.next = first;
            curr= curr.next.next;
        }
        
        return node.next;
    }
}



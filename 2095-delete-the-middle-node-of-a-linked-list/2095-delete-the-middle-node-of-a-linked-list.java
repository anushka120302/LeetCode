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
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode counting= head, temp=head;
        
        int count=0;
        if(head==null || head.next==null)
            return null;
            
        else 
        {
            while(counting!=null)
            {
                count++;
                counting=counting.next;
            }
        }
        
        ListNode lr=head;
        
        if(count%2==0)
        {
            for(int i=1;i<count/2;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        else if(count%2==1)
        {
            for(int i=1;i<count/2;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        return head;
    }
}
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        ListNode[] ans= new ListNode[k];

        ListNode it=head;
        int tlen=0;

        while(it!=null)
        {
            tlen++;
            it=it.next;
        }

        int len=tlen/k;
        int rem=tlen%k;

        ListNode prev=null;
        ListNode node=head;
        int i =0;
        while(node!=null && i<k)
        {
            ans[i]=node;
            for(int j =0;j<len+(rem>0?1:0);j++)
            {
                prev=node;
                node=node.next;
            }
            prev.next=null;
            i++;
            rem--;
        }
        return ans;
    }
}
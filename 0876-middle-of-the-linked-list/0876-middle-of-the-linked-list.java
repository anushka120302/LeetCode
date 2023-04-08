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
    public ListNode middleNode(ListNode head) {
        ListNode n=head;
        int x=0,c=0;
        while(n!=null)
        {
            x++;
            n=n.next;
        }
        int mid=x/2;
        n=head;
        
        while(mid!=0)
        {
            n=n.next;
            mid--;
        }
        return n;
        /*if(x%2==0)
        {
            while(c<(x/2+1)){
                head=head.next;
                c++;
            }
            
        }
        else
        {
            while(c<x/2){
                head=head.next;
                c++;
            }
            
        }
        return head;*/
    }
}
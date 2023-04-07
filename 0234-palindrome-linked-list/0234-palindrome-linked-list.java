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
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        
        while(head!=null)
        {
            sb.append(head.val);
            head=head.next;
        }
        
        String a= sb.toString();
        
        String b= sb.reverse().toString();
        
        if(a.equalsIgnoreCase(b))
        {
            return true;
        }
        return false;
    }
}
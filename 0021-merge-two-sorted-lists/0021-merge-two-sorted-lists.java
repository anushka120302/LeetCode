/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() 
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode ans = null;
        ListNode temp = null;
        while(list1!=null&&list2!=null)
        {
            ListNode curr = list1.val<list2.val?list1:list2;
            if(list1==curr) list1 = list1.next;
            if(list2==curr) list2 = list2.next;
            if(ans==null)
            {
                ans = temp = curr;
            }
            else
            {
                temp.next = curr;
                temp = temp.next;
            }
        }
        if(temp!=null)temp.next = list1==null?list2:list1;
        else temp = ans = list1==null?list2:list1;
        return ans;
    }
}
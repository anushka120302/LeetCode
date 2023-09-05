/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curr= head;
        while(curr!=null)
        {
            Node temp = curr.next;
            curr.next= new Node(curr.val);
            curr.next.next=temp;
            curr=temp;
        }
        curr=head;

        while(curr!=null)
        {
            if(curr.next!=null)
            {
                curr.next.random=(curr.random!=null? curr.random.next: null);
            }
            curr=curr.next.next;
        }
         Node cloneHead = new Node(0);
        Node tempHead = cloneHead;
        Node temp = head;
        while(temp != null) {
            Node next = temp.next.next;
            Node clone = temp.next;
            tempHead.next = clone;
            tempHead = clone;
            temp.next = next;
            temp = next;
        }
        return cloneHead.next;
    }
}
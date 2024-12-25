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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
        return null;
        }

        ListNode current = head;
        
        int n=0;
        while(current.next != null){
            current = current.next;
            n++;
        }

        ListNode Last = current;
        
        ListNode t = head;
        head = t.next;
        Last.next = t;
        t.next = null;
        ListNode s = t;

        for(int i = 1; i <= n; i++){
            t = head = t.next;
            head = t.next;
            Last.next = t;
            t.next = s;
            s = t;
        }

        return t;
        
    }
}

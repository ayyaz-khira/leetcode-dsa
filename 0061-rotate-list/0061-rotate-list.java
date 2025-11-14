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
    public ListNode rotateRight(ListNode head, int k) {
        int n=1;
        if(head==null || head.next==null || k==0) return head;
        ListNode temp=head;
        while(temp.next!=null){
            n++;
            temp=temp.next;
        }

        temp.next=head;

        ListNode ptr=head;
        int i=0;
        k=k%n;
        while(i<n-k-1){
            ptr=ptr.next;
            i++;
        }


        ListNode newHead=ptr.next;
        ptr.next=null;

        return newHead;
    }
}
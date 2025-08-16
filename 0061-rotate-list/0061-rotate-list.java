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
        if(head==null || head.next==null || k==0) return head;
        ListNode temp=head;
        int n=1;
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }

        temp.next=head;
        ListNode ptr=head;
        k=k%n;
        for(int i=0;i<n-k-1;i++){
            ptr=ptr.next;
        }

        ListNode newHead=ptr.next;
        ptr.next=null;
        

        return newHead;

        
    }
}
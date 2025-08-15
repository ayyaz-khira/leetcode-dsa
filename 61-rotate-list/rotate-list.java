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
        if(head==null) return null;
        if(k==0) return head;
        ListNode temp=head;
        int n=0;
        while(temp.next!=null){

            temp=temp.next;
            n++;
            
        }
        n++;
        if(k%n==0) return head;
        k=k%n;

        int i=0;
        ListNode ptr=head;
        while(i<n-k-1){
            ptr=ptr.next;
            i++;
        }
        ListNode newHead=ptr.next;
        ptr.next=null;
        temp.next=head;
        
        return newHead;
        
    }
}
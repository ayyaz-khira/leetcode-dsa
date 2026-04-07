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

    public ListNode getMiddle(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }


        return slow;
    }

    public ListNode merge(ListNode first,ListNode second){
        
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;

        while(first!=null && second!=null){
            if(first.val<second.val){
                temp.next=first;
                first=first.next;
                temp=temp.next;
            }
            else if(first.val>=second.val){
                temp.next=second;
                second=second.next;
                temp=temp.next;
            }
        }

        if(first==null) temp.next=second;
        else temp.next=first;

        return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode mid=getMiddle(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;

        left=sortList(left);
        right=sortList(right);

        return merge(left,right);


        
    }
}
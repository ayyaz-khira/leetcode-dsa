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

    public ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode prev=null;
        ListNode next;

        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;

        }

        return prev;
    }


    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }





    public boolean isPalindrome(ListNode head) {
        ListNode first=head;
        ListNode mid=middle(head);

        ListNode second=reverse(mid);


        while(second!=null){
            if(first.val!=second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }

        return true;

        
        
    }
}
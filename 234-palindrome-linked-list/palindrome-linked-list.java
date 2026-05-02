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



    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ListNode first=head;
        ListNode second=head;
        int count=0;

        while(temp!=null){
            temp=temp.next;
            count+=1;
        }

        for(int i=0;i<count/2;i++){
            second=second.next;
        }


        ListNode newSecond=reverse(second);
        second.next=null;

        while(newSecond!=null){
            if(first.val!=newSecond.val) return false;
            first=first.next;
            newSecond=newSecond.next;
        }



        return true;


        
    }
}
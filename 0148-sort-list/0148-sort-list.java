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
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        ListNode temp=head;
        List<Integer> list=new ArrayList<>();
        list.add(head.val);
        while(temp.next!=null){
            temp=temp.next;
            list.add(temp.val);
        }

        Collections.sort(list);

        temp=head;
        temp.val=list.get(0);
        int i=1;
        while(temp.next!=null){
            temp=temp.next;
            temp.val=list.get(i++);
        }


        return head;
        
    }
}
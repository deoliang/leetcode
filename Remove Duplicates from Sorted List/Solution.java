/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode move = head;
        while(move!=null&&move.next!=null){
            if(move.val==move.next.val){
                move.next = move.next.next;
            }else{
                move = move.next;
            }
        }
        return head;
    }
}
//Link: https://leetcode.com/problems/middle-of-the-linked-list/

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
    public ListNode middleNode(ListNode head) {
        ListNode itr = head;
        int n = 0;
        while(itr != null) {
            n++;
            itr = itr.next;
        }
        itr = head;
        for(int i = 1; i <= n/2; i++) {
            itr = itr.next;
        } 
        return itr;
    }
}
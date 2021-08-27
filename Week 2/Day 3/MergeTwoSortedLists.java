/*
Platform: Leetcode
Problem Code: 21
Link: https://leetcode.com/problems/merge-two-sorted-lists/
*/

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == l2) 
            return l1;  
        if(l1 == null) 
            return l2;
        if(l2 == null) 
            return l1;
        
        
        ListNode mergedHead,mergedTail;
        mergedHead = mergedTail = new ListNode(-1);
        
        ListNode next;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                next = l1.next;
                l1.next = null;
                
                mergedTail.next = l1;
                mergedTail=l1;
                l1= next;
            } else {
                next = l2.next;
                l2.next = null;
                
                mergedTail.next = l2;
                mergedTail=l2;
                l2 = next;
            }
        }
        
        while(l1 != null) {
            next = l1.next;
            l1.next = null;

            mergedTail.next = l1;
            mergedTail=l1;
            l1= next;
        }
        
        while(l2 != null) {
            next = l2.next;
            l2.next = null;

            mergedTail.next = l2;
            mergedTail=l2;
            l2 = next;
        }
        
        return mergedHead.next;
            
    }
}
/*
Coding Platform: Geeksforgeeks
Link: https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1#
*/
class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        HashSet<Node> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head))
                return true;
            set.add(head);
            
            head = head.next;
        }
        return false;
    }
}
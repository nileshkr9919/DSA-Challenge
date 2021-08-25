/* 
Platform: Geeksforgeeks
Link: https://practice.geeksforgeeks.org/problems/queue-reversal/1#
*/

class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Queue<Integer> r = new LinkedList<>();
        Stack<Integer> t = new Stack<>();
        while(!q.isEmpty()){
            t.push(q.peek());
            q.remove();
        }
        while(!t.isEmpty())
            r.add(t.pop());
        return r;
    }
}
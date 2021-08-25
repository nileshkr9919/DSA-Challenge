/* 
Platform: Leetcode
Problem code: 232 
Link: https://leetcode.com/problems/implement-queue-using-stacks/
*/

class MyQueue {
    
    Stack a,b;
    /** Initialize your data structure here. */
    public MyQueue() {
        a = new Stack();
        b = new Stack();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(a.isEmpty())
            a.push(x);
        else{
            while(!a.isEmpty()){
                b.push(a.pop());
            }
            a.push(x);
            while(!b.isEmpty()){
                a.push(b.pop());
            }
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return (int)a.pop();
            
    }
    
    /** Get the front element. */
    public int peek() {
            int i=0, val = -1;
        while(!a.isEmpty()){
            if(i==0){
                val = (int)a.pop();
                b.push(val);
            }
            else
                b.push(a.pop());
            i++;
        }
        while(!b.isEmpty()){
            a.push(b.pop());
        }
        return val;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(a.isEmpty())
            return true;
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
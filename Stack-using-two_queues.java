public class Stack-using-two_queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    q2.add(a);
	    while(!q1.isEmpty()){
	        q2.add(q1.remove());
	    }
	    while(!q2.isEmpty()){
	        q1.add(q2.remove());
	    }
    }

    // Function to pop an element from stack using two queues.
    int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.remove();
    }
}

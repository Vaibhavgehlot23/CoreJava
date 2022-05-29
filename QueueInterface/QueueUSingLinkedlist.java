package QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUSingLinkedlist {
	public static void main(String[] args) {
		
		Queue q = new LinkedList();
		
		//q.offer(0);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		//q.offer( ,); // inserts element if possible , return true if possible
		//q.remove(); // removes head element , top element
		//System.out.println(q.poll()); //same as remove
		//q.element();// same as peek
		//System.out.println(q.peek()); // prints the head element but doesnit remove , also retrn null
		//System.out.println(q.element());
		System.out.println(q);
		
		
	}

}

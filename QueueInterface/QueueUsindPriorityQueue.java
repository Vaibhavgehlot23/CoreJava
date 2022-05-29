package QueueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueUsindPriorityQueue {
	public static void main(String[] args) {
		Queue q1 = new PriorityQueue();
		
		 q1.offer(8);
		 q1.offer(2);
		 q1.offer(3);
		 q1.offer(4);
		 q1.offer(5);
		 q1.offer(6);
		 q1.offer(7);
		 q1.offer(1);
		 //q1.add(); Add and offer is same
		//System.out.println( q1.peek()); // give output in manner , follows priority , shows value
		// q1.element(); retrives , but does not remove
		 //q1.peek(); same as element
		 //q1.remove(); retrives and remove the head of the queue
		 // q1.poll(); same as remove
		 
		 System.out.println(q1);
	
		
		
	}

}

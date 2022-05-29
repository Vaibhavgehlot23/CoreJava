package ListInterface;

import java.util.List;
import java.util.Stack;

public class ListInterfaceWithStack {
	public static void main(String[] args) {

	     Stack l3 = new Stack();
	    
        l3.push(0);
        l3.push(1);
        l3.push(2);
        l3.push(3);
        l3.push(4);
        l3.push(5);
        l3.push(6);
	
        
      System.out.println( l3.pop());
      System.out.println(l3.pop());
       // l3.pop();
        System.out.println(l3.peek());
       
		System.out.println(l3);

	}

}

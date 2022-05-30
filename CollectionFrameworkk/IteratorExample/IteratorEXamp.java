package IteratorExample;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEXamp {

	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		
		v.add(2);
		v.add("Rays");
		v.add("Tech");
		v.add(22);
		v.add(23);
		v.add(24);
		
		Iterator I = v.iterator();
		   //Iterator runs vertically and brings out in normal form....
		
		
		while (I.hasNext()) {
			Object O =  I.next();
			System.out.println(O);
			
		}
		
	}
	
	
}

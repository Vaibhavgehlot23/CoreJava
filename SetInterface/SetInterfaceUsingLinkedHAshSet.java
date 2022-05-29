package SetInterface;

import java.util.LinkedHashSet;

public class SetInterfaceUsingLinkedHAshSet {

	public static void main(String[] args) {
		LinkedHashSet l = new LinkedHashSet();		
		l.add(1);
		l.add(4);  //Prints same as insertion order ..
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(7);
		l.add(6);
		l.add(8);
		System.out.println(l);
		
		
	}
}

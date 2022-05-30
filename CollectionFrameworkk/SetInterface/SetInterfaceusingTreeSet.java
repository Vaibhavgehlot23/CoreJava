package SetInterface;

import java.util.TreeSet;

public class SetInterfaceusingTreeSet {
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		
		t.add(1);
		t.add(3);
		t.add(4);
		t.add(6);  // Prints as Asscending order
		t.add(7);  // Sorted set includes Tree set which works same as this Tree set 
		t.add(2);
		t.add(9);
		t.add(0);
		
		System.out.println(t);
	}

}

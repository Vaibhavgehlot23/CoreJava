package Instanciation_V_Al_HT_HM;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

public class Instantiatee {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(2);
		v.add(3);
		v.add(3);
		v.add(3);

		// Vector v1 = new Vector(20);

		int i = v.size();
		int j = v.capacity();
		System.out.println(i);
		System.out.println(j);

		ArrayList a = new ArrayList();
		a.add(2);
		a.add(3);
		a.add(3);
		a.add(3);
		a.add(4);

		int k = a.size();
	//int l = a.capacity();
		System.out.println(k);
		//System.out.println(l);
		
		
		Hashtable ht = new Hashtable();
	ht.put(1, "value");
	ht.put(2, "vvalue");
	
	int s = ht.size();

		System.out.println(s);

	}

}

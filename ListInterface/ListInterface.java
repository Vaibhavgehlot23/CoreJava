package ListInterface;
import java.util.ArrayList;
import java.util.List;

public class ListInterface {
public static void main(String[] args) {
	
	
	List l = new ArrayList();

	l.add(0);
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.add(5);
	l.add(6);
	l.add(7);
	l.add(8);
	l.add(9);
	l.add(2, 3);
	
	//l.get();
	//l.remove(8);
	l.set(3, 6);
	//l.indexOf(3);
	//l.lastIndexOf(5);
	//l.subList(2, 4);
//	for (int i = 0; i < l.size(); i++) {
		
		System.out.println(l);
	}
	

	
}


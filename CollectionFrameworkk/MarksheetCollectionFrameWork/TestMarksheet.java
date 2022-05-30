package MarksheetCollectionFrameWork;
import java.util.*;
public class TestMarksheet {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		Marksheetexample m1 = new Marksheetexample("0101Ec171121", "Rays",45, 60, 70);
		Marksheetexample m2 = new Marksheetexample("0101EC171122","TEch",56,30,60);
		
		l.add(m1);
		l.add(m2);
		l.contains(m2);
		
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
			Marksheetexample m = null;
			
			 m=(Marksheetexample)  it.next();
			
			 System.out.print(m.getRollNo()+" , ");
			 System.out.print(m.getName()+" , ");
			 System.out.print(m.getMaths()+" , ");
			 System.out.print(m.getPhysics()+" , ");
			 System.out.println(m.getChemistry());
		}
		
		
		
		
		
	}

}

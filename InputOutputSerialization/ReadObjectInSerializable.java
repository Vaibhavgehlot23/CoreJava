package InputOutputSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ReadObjectInSerializable {
	public static void main(String[] args) throws Exception {
		FileInputStream file =  new FileInputStream("D:\\a.ser");
		ObjectInputStream in = new ObjectInputStream(file);
		Employee emp = (Employee)in.readObject();
		
		System.out.println("ID : "+emp.getId());
		System.out.println("F Name: "+emp.getFirstName());
		System.out.println("L Name: "+emp.getLastName());
		System.out.println("Temp Value : "+emp.getTempValue());
		
		
		
		
		
		
	}

}

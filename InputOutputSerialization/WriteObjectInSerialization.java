package InputOutputSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjectInSerialization {
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("D:\\a.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Employee emp = new Employee(23,"Rays","Tech");
		
		out.writeObject(emp);
        out.close();	
        System.out.println("Object Successfully persisted");
        
	}

}

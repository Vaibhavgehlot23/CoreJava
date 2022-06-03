package InputOutputPrimitivedataType;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WritePrimitiveData {
	public static void main(String[] args) throws Exception {
		FileOutputStream f = new FileOutputStream("D:\\Prim.dat");
		
		DataOutputStream out = new DataOutputStream(f);
		
		out.write(23);
		out.writeBoolean(true);
		out.writeChar('L');
		out.writeDouble(23.22);
		out.close();
		f.close();
		System.out.println("Primitive data Successfully written");
		
		
		
	}

}

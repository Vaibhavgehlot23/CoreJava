package InputOutputPrimitivedataType;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadPrimitiveData {
	public static void main(String[] args) throws Exception {
		FileInputStream f = new FileInputStream("D:\\prim.dat");
		
		DataInputStream in = new DataInputStream(f);
		
		System.out.println(in.read());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		
		
		
		
		
		
		
	}

}

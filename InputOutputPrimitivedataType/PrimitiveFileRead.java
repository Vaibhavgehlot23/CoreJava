package InputOutputPrimitivedataType;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class PrimitiveFileRead {
	public static void main(String[] args) throws Exception {
		
		long Dataposition = 0;
		int data = 0;
		RandomAccessFile r = new RandomAccessFile("Prim.dat", "r");
		
		Dataposition = r.readLong();
		
		System.out.println("dataPosition : "+ Dataposition);
		
		r.seek(Dataposition);
		data = r.readInt();
		r.close();
		System.out.println("The data is  : "+data);
		
		
		
		
		
		
		
		
		
		
	}

}

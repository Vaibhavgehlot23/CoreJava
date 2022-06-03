package InputOutputPrimitivedataType;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class PrimitiveFIleWrite {
	public static void main(String[] args) throws Exception {
		
		long Dataposition = 0;
		RandomAccessFile i = new RandomAccessFile("Prim.dat","rw");
		i.writeLong(222322);
		i.writeChars("raysssssss");
		Dataposition = i.getFilePointer();
		i.writeInt(123);
		i.writeBytes("techhhhh");
		
		i.seek(0);
		i.writeLong(Dataposition);
		i.close();
		
		
		
	}

}

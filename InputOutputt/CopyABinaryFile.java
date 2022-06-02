package InputOutputt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//copy the images as contains in source copied to target..
public class CopyABinaryFile {
	public static void main(String[] args) throws Exception {

		String source = "D:\\im.jpg";
		String Target = "D:\\final.jpg";

		FileInputStream reader = new FileInputStream(source);
		FileOutputStream writer = new FileOutputStream(Target);

		int c = reader.read();
       
		while (c != -1 ){
			writer.write(c);
			
			c = reader.read();
			
			
		}
		
		writer.close();
		reader.close();
		System.out.println(source+"is copied "+Target);
		
	}

}

package InputOutputt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
//Copys the data from one source to target...prints same as text in one
public class CopyaTxtFile {
	public static void main(String[] args) throws Exception {
		
		String Source = "D:\\rays.txt";
		String Target = "D:\\new.txt";
		
		FileReader reader = new FileReader(Source);
		FileWriter writer = new FileWriter(Target);
		
		int c = reader.read();
		while (c !=-1) {
			writer.write(c);
			c = reader.read();
			
		}
		
		writer.close();
		reader.close();
		
		System.out.println(Source +"is copied to"+Target);
				
		
		
		
		
		
		
	}

}

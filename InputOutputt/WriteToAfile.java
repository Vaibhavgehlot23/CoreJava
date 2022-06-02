package InputOutputt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//print text in or write in selected file
public class WriteToAfile {
public static void main(String[] args) throws Exception {
	
	FileWriter Writer = new FileWriter("C:\\Rays.txt");
	PrintWriter p = new PrintWriter(Writer);
	
	for (int i = 0; i < 5; i++) {
		p.println(i+":Test");
	}
	
	p.close();
	Writer.close();
	System.out.println("Done");
}
}

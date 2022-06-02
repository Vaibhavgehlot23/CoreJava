package InputOutputt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendWriteFile {


//Direct prints in text file and if you write true then it will not clear the already saved data
	public static void main(String[] args) throws Exception {

		FileWriter Writer = new FileWriter("C:\\Rays.txt",true);
		PrintWriter p = new PrintWriter(Writer);

		for (int i = 0; i < 5; i++) {
			p.println(i + ":JAva");
		}

		p.close();
		Writer.close();
		System.out.println("Done");
	}
}

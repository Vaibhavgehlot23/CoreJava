package InputOutputt;

import java.io.BufferedReader;
import java.io.FileReader;
//Read file line by line from the given text path..
public class ReadaFileLineBuLine {
	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("D:\\abc.txt");
		BufferedReader b = new BufferedReader(reader);

		String line = b.readLine();

		while (line != null) {
			System.out.println(line);
			line = b.readLine();

		}
		reader.close();

	}

}

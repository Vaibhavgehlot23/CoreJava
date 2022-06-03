package InputOutputScannerClassIO;

import java.util.StringTokenizer;

public class Tokenizerr {

	public static void main(String[] args) {
		String s = "This is java,java is oop, java is guratee for job";
		StringTokenizer t = new StringTokenizer(s, ",");
		String Token = null;
		while (t.hasMoreElements()) {
			Token = t.nextToken();
			System.out.println(Token);
		}
	}
}

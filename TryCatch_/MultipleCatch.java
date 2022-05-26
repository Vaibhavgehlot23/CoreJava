package TryCatch_;

public class MultipleCatch {
	public static void main(String[] args) {
		
		String name = "Rays";
		try {
			System.out.println("Total length is "+ name.length());
			System.out.println("Character at "+name.charAt(6));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String is small");
		}
		catch(NullPointerException e) {
			System.out.println("String has no name");
		}
		
	finally {
		System.out.println("Clear up , release memory");
	}

}
}
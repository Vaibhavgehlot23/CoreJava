package TryCatch_;

public class ParentCatch {
	public static void main(String[] args) {
		String name = "Vijay";
		
		try {
			System.out.println("Total length "+name.length());
			System.out.println("Character at "+name.charAt(7));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String is small");
			System.exit(0);
			}
		catch(RuntimeException e) {
 		System.out.println("Rayss");
			
	System.exit(0);	}
		finally {
			System.out.println("indore");
		}
		
		
		
		
	}

}

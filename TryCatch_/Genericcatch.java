package TryCatch_;

public class Genericcatch {
	public static void main(String[] args) {
		
		String n ="rays";
		try {
			System.out.println(n.length());
			System.out.println(n.charAt(6));
			
		} catch (Exception e) {
			System.err.println("Error  "+e.getMessage());
		}
		
		
	}

}

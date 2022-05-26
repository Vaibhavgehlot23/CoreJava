package TryCatch_;

public class OderofcatchBlock {
public static void main(String[] args) {
	 String name = "Rays";
	 try {
		 System.out.println("Total length "+name.length());
	 System.out.println("Character at index "+name.charAt(7)); }
	 catch(StringIndexOutOfBoundsException e) {
		 System.err.println("String is small");
	 }
	 catch (RuntimeException e) {
		 System.err.println("Error"+e.getMessage());
	}
	
	//first child exeption then parent exeption
}
}

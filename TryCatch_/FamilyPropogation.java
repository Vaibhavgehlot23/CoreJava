package TryCatch_;

public class FamilyPropogation {
	public static void main(String[] args) {
		
		try {
			authenticate("vijay");			
		} catch (FamilyPropogation exp) {
			System.out.println("Inavlid Id/Pwd");
		}
		
	}

	private static void authenticate(String login)throws LoginException {
		// TODO Auto-generated method stub
		
	}
	}


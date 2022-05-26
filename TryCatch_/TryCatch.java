package TryCatch_;

public class TryCatch {
	public static void main(String[] args) {
		int k = 0;
		int i = 15;
		
		try {
			double div = i / k;
			System.out.println("div is" + div);

		} catch (ArithmeticException e) {
			System.out.println("divided by zero");
		}

		
	}
}

package TryCatch_;


public class TryCatchAccount throws Exception {
	
	    class Account {
		private String number;
		private String accountType;
		private double balance;
		private double rB;
		private double wA;

		public String getNumber() {
			return number;
		}

		public void setNumber(String n) {
			number = n;

		}

		public String getAccountType() {
			return accountType;
		}

		public void setAccountType(String AT) {
			accountType = AT;
		}

		public void deposit(double d) {
			balance = balance + d;
		}

		public void withdrawal(double wA) throws InsufficientException
		{
			rB = balance -wA;
			if(rB<500)
			{
				System.out.println("Insufficient Balance");
			}
			else {
				System.out.println("Transaction succesfully completed");
				System.out.println("Withdrawl Amount -- "+ wA);
				System.out.println("After transaction cureent balance -- "+rB);
			}
			
		}

		public double getBalance() {
			return rB;
		}

		public void fundtransfer(double d) {
			balance = balance - d;
		}

		public void paybill(double d) {
			balance = balance - d;
		}
	}
}

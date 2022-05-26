package TryCatch_;

public class ExecuteAccount {
       public static void main(String[] args)throws Exception {
    	   InsufficientException e = new InsufficientException();
    	   e.deposit(1000);
    	   e.withdrawl(500);
    	  
		
	}
}


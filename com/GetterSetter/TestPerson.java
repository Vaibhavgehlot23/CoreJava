package com.GetterSetter;


public class TestPerson {

	public static void main(String[] args) {
		
			Person p1 =new Person(); 
			p1.setname("Vaibhav");
			p1.setaddress("Indore");
		    
		   p1.getname();
		   
		   p1.getaddress();
			
		
			
			System.out.println("NAME -- "+ p1.getname());
			System.out.println("ADDRESS -- "+p1.getaddress());
			System.out.println("");
			
			
		
	Account a =new Account();
	a.setNumber("20325832410");
	a.setAccountType("Saving");
	a.deposit(40000.450);
	a.withdrawal(5555);
	a.fundtransfer(2223);
	
	a.getAccountType();
	a.getBalance();
	a.getNumber();
	
	System.out.println("ACCOUNT NUMBER -- "+a.getNumber());
	System.out.println("ACCOUNT TYPE -- "+a.getAccountType());
	System.out.println("ACCOUNT BALANCE -- "+a.getBalance());
	
	
	Automobile am = new Automobile();
	am.setMake("VELLAR");
	am.color("BLACK");
	am.changeGear(2);
    am.brake(23);
	am.accelerator(180);
	am.getSpeed();
	
	am.getMake();
	am.getSpeed();
	am.color();

	System.out.println("CAR NAME -- "+am.getMake());
	System.out.println("CAR COLOR -- "+am.color());
	System.out.println("CAR SPEED -- "+am.getSpeed());
	
	
	
	
	
	
	
	
	
}
}


package com.GetterSetter;

public class Account {
private String number;
private String accountType;
private double balance;

public String getNumber(){
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
	balance = balance+d;	
}
public void withdrawal(double d) {
	balance = balance-d;
}
public double getBalance(){
return balance;
}
public void fundtransfer(double d) {
	balance = balance-d;
}
public void paybill(double d) {
	balance = balance -d;
}	
	
	
	
	
	
	
	
	
	
	
	

}


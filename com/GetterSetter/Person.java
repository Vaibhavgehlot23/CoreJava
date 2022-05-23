package com.GetterSetter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	
private String name;
private Date Date;
private String address;
SimpleDateFormat s =new SimpleDateFormat("dd/MM/yyyy");


public void setDate(String s2) throws ParseException{
	Date = s.parse(s2);
	
	}

public String  getDate() {
	String s1 = s.format(Date);
	return s1;
}

public void setname(String s1) {
	this.name = s1;

}

public String getname() {
	return name;
}

public void setaddress(String s2) {
this.address = s2;
}
public String getaddress() {
	return address;
}


	
}










	
	



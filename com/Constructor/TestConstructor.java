package com.Constructor;

public class TestConstructor {
	public static void main(String[] args) {
		
	
	Constructor c = new Constructor("red",2 , "circle");
		
		c.getcolor();
		c.getBorderWidth();
		c.getshape();
		
		System.out.println(c.getcolor());
		System.out.println(c.getBorderWidth());
		System.out.println(c.getshape());
		
	
	}

}

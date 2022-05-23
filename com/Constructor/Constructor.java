package com.Constructor;

public class Constructor{
	private String color = "Null";
	private int BorderWidth = 0;
	private String shape ="Null";

	
public Constructor() {
	System.out.println("This is default Constructor");
}
public  Constructor (String s , int w , String h) {
 color=s;
 BorderWidth = w;
 shape = h;

}
public String getcolor() {
   return color;
}
public int getBorderWidth() {
	return BorderWidth;
}

public String getshape() {
	return shape;
}

}




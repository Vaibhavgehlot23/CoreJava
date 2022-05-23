package com.Assignment;
import java.util.*;
import java.text.SimpleDateFormat;
public class ExerciseDateTime {
	public static void main(String[] args) {
		Date d = new Date();
				
	
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	String str = format.format(d);
	System.out.println(""+str);
	
			
	}
}


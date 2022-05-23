package com.Assignment;

public class SwappingWithout3rdVariable {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a=a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping :");
		System.out.println("Value of a :"+a);
		System.out.println("Value of b :"+b);
	}

}

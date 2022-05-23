package com.Assignment;

public class CountCharct {
	public static void main(String[] args) {
		String s = "Rays Technology";
		int T1 = s.length();
		int T2 = s.replace("","").length();
		int Total = T1-T2;
		System.out.println("total no. of R " +Total);
	}
}
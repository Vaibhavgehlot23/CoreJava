package com.Assignment414;

public class Palindrome {
	public static void main(String[] args) {
		int a = 212;
		int r;
		int s=0;
		int temp ;
		temp = a;
		while (a>0)
		{
			 r = a %10;
			s = (s*10)+r ;
			 a =a/10;
		}
		if(temp==s) {
			System.out.println("It is a palondrome no.--" + s);
			}
		else
		{
			System.out.println("It is not palindrome no.--"+s);
		}
	}
}

package com.Assignment414;

public class ReverseNumber {
 public static void main(String[] args) {
	int n = 1234;
	int r;
	int s=0;

	while (n>0)
	{
		r = n%10;
		n=n/10;
		s=(s*10)+r;
		
	}
	System.out.println(s);
}
}

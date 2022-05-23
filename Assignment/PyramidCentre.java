package com.Assignment;

public class PyramidCentre {
public static void main(String[] args) {
	int a = 0;
	for(int i = 1;i<=6;i++,a=0) {
		for(int j=1;j<=6-i;j++) {
			System.out.print(" ");
	}
		while(a!=2*i-1) {
			System.out.print("*");
			a++;
		}
		System.out.println();
}
}
}
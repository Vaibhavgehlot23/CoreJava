package Polymorphism;

public class MethodOverLoading {
	public static void main(String[] args) {
		MethodOverLoading m=new MethodOverLoading();
		
		System.out.println(m.add(10, 10, 20));
	}

	public int add(int a, int b) {
		int s = a + b;
		return s;
	}

	public int add(int a, int b, int c) {
		int s = a + b + c;
		return s;
	}

	public int add(int a, float f) {
		float g = a + f;
		return (int) g;
	}

	public double add(int a, double d) {
		double n = a + d;
		return  n;

	}
}

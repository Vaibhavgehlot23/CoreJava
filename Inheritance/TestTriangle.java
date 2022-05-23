package Inheritance;

public class TestTriangle {
	public static void main(String[] args) {
		
		Triangle T = new Triangle();
		T.setBase(3);
		T.setHeight(3);

		System.out.println(T.area());
	}

}

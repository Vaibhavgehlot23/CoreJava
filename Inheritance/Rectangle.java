package Inheritance;

public class Rectangle extends Shape {
	private int length;
	private int width;
	private double area;
public Rectangle() {
	// TODO Auto-generated constructor stub
}
public void  rectangle(int l,int w) {
	this.length=l;
	this.width=w;
}


	public Double area() {
		return (double) (length*width);
	}

	public double getArea() {
		return area;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
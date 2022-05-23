package com.GetterSetter;

public class Automobile {
	private String color;
	private int speed;
	private String make;
	
	public String color() {
		return color;
	}
public void color(String c) {
	color = c;
}
public String getMake() {
	return make;
}
public void setMake(String m) {
	make = m;
}
public void brake (int b) {
	speed = speed - speed;
}
public void changeGear(int cg) {
	speed = cg;
}
public void accelerator(int ac) {
	speed  = speed+ac;
}
public int getSpeed() {
	return speed;
}

}

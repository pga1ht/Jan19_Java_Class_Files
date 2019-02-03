package ch8;

public abstract class Shape {
	private int x, y;
	private String color;
	
	public abstract double getArea();  //every shape has an area but the calculation is different for each shape
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}

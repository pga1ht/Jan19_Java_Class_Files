package ch8;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int r) {
		setRadius(r);
	}
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}


	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
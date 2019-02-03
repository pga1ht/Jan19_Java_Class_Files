package ch8;

public class Rectangle extends Shape {
	private int height, width;
	
	public Rectangle(int h, int w) {
		setHeight(h);
		setWidth(w);
		
	}
	
	@Override
	public double getArea() {
		return height * width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
}

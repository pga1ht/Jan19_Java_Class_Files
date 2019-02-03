package ch8;

public class ShapeTester {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 10);
		shapes[1] = new Rectangle(10, 20);
		shapes[2] = new Circle(10);
		
		for(Shape shape : shapes) {
			System.out.println(shape.getArea());
			
		}

	}

}

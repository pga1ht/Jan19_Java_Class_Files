package ch7;

public class L4 {

	public static void main(String[] args) {
		Vehicle[] vs = new Vehicle[3];
		vs[0] = new Bicycle(10);
		vs[1] = new Bicycle(3);
		vs[2] = new Vehicle();
		
		for (Vehicle v : vs) {
			System.out.println(v);
		}
		

	}

}

package ch7;

public class L5 {

	public static void main(String[] args) {
		Object[] vs = new Object[3];
		vs[0] = new Bicycle(10);
		vs[1] = new Bicycle(3);
		vs[2] = new Vehicle();
		
		for (Object v : vs) {
			System.out.println(v);
		}
		

	}

}

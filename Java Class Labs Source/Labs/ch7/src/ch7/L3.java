package ch7;

public class L3 {

	public static void main(String[] args) {
		Vehicle v = new Vehicle(45,3);
		Bicycle b = new Bicycle();
		b.setMaxSpeed(30);
		b.setNumGears(10);
		
		System.out.println(v);
		System.out.println(b);


	}

}

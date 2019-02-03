package ch7;

public class Bicycle extends Vehicle {
	
	protected int numGears; 
	
	public Bicycle() {
		numWheels = 2;      //bicycles will always have two wheels

	}
	
	public Bicycle(int speed) {
		super(speed, 2);   
	}
	
	public int getNumGears() {
		return numGears;
	}

	public void setNumGears(int numGears) {
		this.numGears = numGears;
	}

	@Override
	public String toString() {
		return "Bicycle [numGears=" + numGears + "]"
				+ super.toString();
	}
	
}

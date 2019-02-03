package ch7;

public class Vehicle {
	
	private int maxSpeed;
	protected int numWheels;
	
	public Vehicle() {
	}

	public Vehicle(int speed, int wheels) {
		setMaxSpeed(speed);
		setNumWheels(wheels);
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	@Override
	public String toString() {
		return "Vehicle [maxSpeed=" + maxSpeed + ", numWheels=" + numWheels + "]";
	}

	
}

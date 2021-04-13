package Assignment1;

public class Car {

	private int mpg;
	private int maxFuel;
	private double currentFuel;

	public Car(int mpg, int maxFuel) {
		this.mpg = mpg;
		this.maxFuel = maxFuel;
		this.currentFuel = maxFuel;
	}

	public void drive(int miles) {

		if (miles / mpg > currentFuel) {
			System.out.println("Error: not enough gas to drive given distance.");
		} else {
			currentFuel -= miles / mpg;
		}
	}

	public double getGasInTank() {
		return currentFuel;
	}

	public void addGas(double amt) {
		if (currentFuel + amt > maxFuel) {
			currentFuel = maxFuel;
		} else {
			currentFuel += amt;
		}
	}
}

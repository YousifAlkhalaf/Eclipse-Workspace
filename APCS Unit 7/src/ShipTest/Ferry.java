package ShipTest;

public class Ferry extends Ship {

	private int passengers;

	public Ferry(String shipName, int manufactureYear, int passengerCapacity) {
		super(shipName, manufactureYear);
		passengers = passengerCapacity;
	}

	public int getPassengerCap() {
		return passengers;
	}

	public void setPassengerCap(int n) {
		passengers = n;
	}

	public String toString() {
		String s = String.format("%s:  %d passengers", this.getName(), passengers);
		if (this.getSailCheck() == false) {
			s += " DO NOT SAIL";
		}
		return s;
	}
}

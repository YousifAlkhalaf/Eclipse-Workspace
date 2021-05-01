package ShipTest;

public class CargoShip extends Ship{

	private int cargo;
	
	public CargoShip(String shipName, int manufactureYear, int cargoCapacityTons) {
		super(shipName, manufactureYear);
		cargo = cargoCapacityTons;
	}

	public int getCargoCap() {
		return cargo;
	}

	public void setCargoCap(int n) {
		cargo = n;
	}
	
	public String toString() {
		String s = String.format("%s:  %d tons", this.getName(), cargo);
		if (this.getSailCheck() == false) {
			s += " DO NOT SAIL";
		}
		return s;
	}
}

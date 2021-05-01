package ShipTest;

public class Ship {

	private String name;
	private int year;
	private static boolean okToSail;

	public Ship(String shipName, int manufactureYear) {
		year = manufactureYear;
		name = shipName;
		okToSail = true;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public void setName(String str) {
		name = str;
	}

	public void setYear(int n) {
		year = n;
	}
	
	public boolean getSailCheck() {
		return okToSail;
	}
	
	public void setSailCheck(boolean bool) {
		okToSail = bool;
	}
	
	public String toString() {
		String s = String.format("%s:  %d", name, year);
		if (okToSail == false) {
			s += " DO NOT SAIL";
		}
		return s;
	}
}

package ShipTest;

import java.util.ArrayList;

public class ShipRunner {
	public static void main(String[] args) {
		ArrayList<Ship> ships = new ArrayList<Ship>();
		
		ships.add(new Ship("Silver Dollar", 2020));
		ships.add(new Ship("The Elkhorn", 1969));
		ships.add(new Ferry("Princess", 2012, 89));
		ships.add(new CargoShip("Bruiser", 2008, 35));
		
		for (Ship s: ships) {
			s.setSailCheck(false);
			System.out.println(s);
		}
	}
}
